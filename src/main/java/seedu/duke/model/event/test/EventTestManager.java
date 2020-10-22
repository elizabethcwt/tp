package seedu.duke.model.event.test;

import seedu.duke.exception.EmptyParameterException;
import seedu.duke.exception.MissingParameterException;
import seedu.duke.model.event.Event;
import seedu.duke.common.LogManager;
import seedu.duke.common.Messages;
import seedu.duke.model.event.EventDataManager;
import seedu.duke.ui.UserInterface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EventTestManager extends EventDataManager {
    private final ArrayList<Event> tests;
    private static final Logger logger = LogManager.getLogManagerInstance().getLogger();
    private final UserInterface userInterface;

    public EventTestManager(ArrayList<Event> inputList) {
        tests = inputList;
        userInterface = UserInterface.getInstance();
    }

    public ArrayList<Event> getTests() {
        return tests;
    }

    public int getTestListSize() {
        assert tests != null;
        return tests.size();
    }

    @Override
    public void add(String userInput) throws EmptyParameterException, MissingParameterException {
        logger.log(Level.INFO, "initialising adding of a test");

        if ((!userInput.contains("/n")) || (!userInput.contains("/s"))
                || (!userInput.contains("/e"))) {
            logger.log(Level.WARNING, "no param is entered");
            throw new MissingParameterException();
        }

        userInput.replaceAll("\\s+","");
        final String[] testDetails = userInput.trim().split("\\/");

        logger.log(Level.INFO, "splitting user input into description, start date and end date");
        String testDescription = testDetails[1].substring(1).trim().replaceAll("\\s+"," ");
        String testStartDate = testDetails[2].substring(1).trim();
        String testEndDate = testDetails[3].substring(1).trim();

        if (testDescription.equals("") || testStartDate.equals("")
                || testEndDate.equals("")) {
            logger.log(Level.WARNING, "description/start date/end date is empty");
            throw new EmptyParameterException();
        }


        try {
            LocalDateTime.parse(testStartDate, DateTimeFormatter.ofPattern("yyyy-MM-dd HHmm"));
            LocalDateTime.parse(testEndDate, DateTimeFormatter.ofPattern("yyyy-MM-dd HHmm"));
            tests.add(new EventTest(testDescription, testStartDate, testEndDate));
        } catch (DateTimeParseException e) {
            logger.log(Level.WARNING, "date&time is not valid or in wrong format");
            userInterface.showToUser(Messages.MESSAGE_INVALID_DATE);
            return;
        }
        logger.log(Level.INFO, "added test to ArrayList");

        userInterface.showToUser(Messages.MESSAGE_TEST_ADD_SUCCESS,
                "  " + tests.get(getTestListSize() - 1));
        getTaskStatement();
    }

    @Override
    public void delete(String[] userInputs) throws IndexOutOfBoundsException {
        int testNumber = 0;
        logger.log(Level.INFO, "initialising deleting of a test");

        try {
            testNumber = Integer.parseInt(userInputs[2]);
        } catch (NumberFormatException e) {
            logger.log(Level.WARNING, "wrong number format entered");
            userInterface.showToUser(Messages.MESSAGE_TEST_DELETE_ERROR_NON_NUMBER);
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            userInterface.showToUser(Messages.MESSAGE_TEST_DELETE_ERROR_NO_NUMBER_GIVEN);
            return;
        }

        if ((testNumber <= 0) || (testNumber > getTestListSize())) {
            logger.log(Level.WARNING, "index entered is out of bounds");
            throw new IndexOutOfBoundsException();
        }

        userInterface.showToUser(Messages.MESSAGE_TEST_DELETE_SUCCESS,
                "  " + tests.get(testNumber - 1));

        tests.remove(testNumber - 1);
        logger.log(Level.INFO, "deleted test from ArrayList");

        getTaskStatement();
    }

    @Override
    public void list() {

    }

    @Override
    public void find(String userInput) throws MissingParameterException {

    }

    private void getTaskStatement() {
        if ((getTestListSize() - 1 == 0) || (getTestListSize() == 0)) {
            userInterface.showToUser("Now you have " + getTestListSize() + " task in the list.");
        } else {
            userInterface.showToUser("Now you have " + getTestListSize() + " tasks in the list.");
        }
    }

    @Override
    public void setDone(String[] userInputs) throws IndexOutOfBoundsException {
        int testNumber = 0;
        logger.log(Level.INFO, "initialising setting test as done");

        try {
            testNumber = Integer.parseInt(userInputs[2]);
        } catch (NumberFormatException e) {
            logger.log(Level.WARNING, "wrong number format entered");
            userInterface.showToUser(Messages.MESSAGE_TEST_DONE_ERROR_NON_NUMBER);
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            userInterface.showToUser(Messages.MESSAGE_TEST_DONE_ERROR_NO_NUMBER_GIVEN);
            return;
        }

        if ((testNumber <= 0) || (testNumber > getTestListSize())) {
            logger.log(Level.WARNING, "index entered is out of bounds");
            throw new IndexOutOfBoundsException();
        }

        tests.get(testNumber - 1).setDone();
        logger.log(Level.INFO, "set test as done from ArrayList");

        userInterface.showToUser(Messages.MESSAGE_TEST_DONE_SUCCESS,
                "  " + tests.get(testNumber - 1));

        getTaskStatement();
    }
}