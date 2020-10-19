package seedu.duke.common;

public class Messages {
    // Intro related messages
    public static final String MESSAGE_LOGO = " ____        _        \n"
            + "|  _ \\ _   _| | _____ \n"
            + "| | | | | | | |/ / _ \\\n"
            + "| |_| | |_| |   <  __/\n"
            + "|____/ \\__,_|_|\\_\\___|\n";
    public static final String MESSAGE_HELLO_FROM_DUKE = "Hello from\n"
            + Messages.MESSAGE_LOGO;
    public static final String MESSAGE_PROMPT_NAME = "What is your name?";
    public static final String MESSAGE_HELLO = "Hello ";
    public static final String MESSAGE_PROMPT_COMMAND = "What can we do for you? "
            + "(Enter 'help' for the list of available commands!)";
    public static final String MESSAGE_EMPTY_SCHEDULE_LIST = "Schedule is empty. Add some!";

    // General error messages
    public static final String MESSAGE_STORAGE_READ_ERROR = "There was an error loading your files.";
    public static final String MESSAGE_STORAGE_INITIALIZATION_ERROR = "STORAGE: There was an error";
    public static final String MESSAGE_INITIALIZATION_LOGGER_FAILED = "Failed to set up logger";
    public static final String MESSAGE_MISSING_PARAMETERS = "☹ OOPS!!! "
            + "Remember to include ALL '/n', '/s' and '/e' inputs!";
    public static final String MESSAGE_EMPTY_PARAMETERS = "☹ OOPS!!! Ensure ALL parameters are filled up!";
    public static final String MESSAGE_INVALID_DATE = "☹ OOPS!!! "
            + "Please enter valid date and time in format yyyy-mm-dd HHMM!";

    // Messages from Contact related classes
    public static final String MESSAGE_SUBJECT_NOT_FOUND = "Subject not found";
    public static final String MESSAGE_NAME_NOT_FOUND = "Name not found";
    public static final String MESSAGE_PHONE_NUMBER_NOT_FOUND = "Phone number not found";
    public static final String MESSAGE_EMAIL_ADDRESS_NOT_FOUND = "Email address not found";
    public static final String MESSAGE_CONTACT_ADD_SUCCESS = "Got it. I've added this contact: ";
    public static final String MESSAGE_CONTACT_DELETE_SUCCESS = "Noted. I've removed this contact: ";
    public static final String MESSAGE_CONTACT_DELETE_ERROR_NON_NUMBER = "☹ OOPS!!! "
            + "Please indicate in NUMERALS, which contact you'd like to delete!";
    public static final String MESSAGE_CONTACT_DELETE_ERROR_NO_NUMBER_GIVEN = "☹ OOPS!!! "
            + "Please indicate which contact you'd like to delete!";
    public static final String MESSAGE_INVALID_CONTACT_INDEX = "☹ OOPS!!! Please indicate a valid contact index!";
    public static final String MESSAGE_EMPTY_CONTACT_LIST = "Contact list is empty. Add some!!";

    // Messages from Class related classes
    public static final String MESSAGE_CLASS_ADD_SUCCESS = "Got it. I've added this class: ";
    public static final String MESSAGE_CLASS_DELETE_SUCCESS = "Noted. I've removed this class: ";
    public static final String MESSAGE_CLASS_DELETE_ERROR_NON_NUMBER = "☹ OOPS!!! "
            + "Please indicate in NUMERALS, which class you'd like to delete!";
    public static final String MESSAGE_CLASS_DELETE_ERROR_NO_NUMBER_GIVEN = "☹ OOPS!!! "
            + "Please indicate which class you'd like to delete!";
    public static final String MESSAGE_CLASS_DONE_SUCCESS = "Nice! I've marked this class as done:";
    public static final String MESSAGE_CLASS_DONE_ERROR_NON_NUMBER = "☹ OOPS!!! "
            + "Please indicate in NUMERALS, which class you'd like to set as Done!";
    public static final String MESSAGE_CLASS_DONE_ERROR_NO_NUMBER_GIVEN = "☹ OOPS!!! "
            + "Please indicate which class you'd like to set as Done!";
    public static final String MESSAGE_INVALID_CLASS_INDEX = "☹ OOPS!!! Please indicate a valid class index!";

    // Messages from Cca related classes
    public static final String MESSAGE_CCA_ADD_SUCCESS = "Got it. I've added this cca: ";
    public static final String MESSAGE_CCA_DELETE_SUCCESS = "Noted. I've removed this cca: ";
    public static final String MESSAGE_CCA_DELETE_ERROR_NON_NUMBER = "☹ OOPS!!! "
            + "Please indicate in NUMERALS, which cca you'd like to delete!";
    public static final String MESSAGE_CCA_DELETE_ERROR_NO_NUMBER_GIVEN = "☹ OOPS!!! "
            + "Please indicate which cca you'd like to delete!";
    public static final String MESSAGE_CCA_DONE_SUCCESS = "Nice! I've marked this cca as done:";
    public static final String MESSAGE_CCA_DONE_ERROR_NON_NUMBER = "☹ OOPS!!! "
            + "Please indicate in NUMERALS, which cca you'd like to set as Done!";
    public static final String MESSAGE_CCA_DONE_ERROR_NO_NUMBER_GIVEN = "☹ OOPS!!! "
            + "Please indicate which cca you'd like to set as Done!";
    public static final String MESSAGE_INVALID_CCA_INDEX = "☹ OOPS!!! Please indicate a valid cca index!";

    // Messages from Test related classes
    public static final String MESSAGE_TEST_ADD_SUCCESS = "Got it. I've added this test: ";
    public static final String MESSAGE_TEST_DELETE_SUCCESS = "Noted. I've removed this test: ";
    public static final String MESSAGE_TEST_DELETE_ERROR_NON_NUMBER = "☹ OOPS!!! "
            + "Please indicate in NUMERALS, which test you'd like to delete!";
    public static final String MESSAGE_TEST_DELETE_ERROR_NO_NUMBER_GIVEN = "☹ OOPS!!! "
            + "Please indicate which test you'd like to delete!";
    public static final String MESSAGE_TEST_DONE_SUCCESS = "Nice! I've marked this test as done:";
    public static final String MESSAGE_TEST_DONE_ERROR_NON_NUMBER = "☹ OOPS!!! "
            + "Please indicate in NUMERALS, which test you'd like to set as Done!";
    public static final String MESSAGE_TEST_DONE_ERROR_NO_NUMBER_GIVEN = "☹ OOPS!!! "
            + "Please indicate which test you'd like to set as Done!";
    public static final String MESSAGE_INVALID_TEST_INDEX = "☹ OOPS!!! Please indicate a valid test index!";

    // Messages from Tuition related classes
    public static final String MESSAGE_MISSING_TUITION_SUFFIX = "☹ OOPS!!! "
            + "Remember to include ALL '/n', '/s', '/e', '/l' suffixes!";
    public static final String MESSAGE_MISSING_TUITION_INPUT = "☹ OOPS!!! "
            + "Remember to include ALL '/n', '/s', '/e', '/l' inputs!";
    public static final String MESSAGE_TUITION_ADD_SUCCESS = "Got it. I've added this tuition: ";
    public static final String MESSAGE_TUITION_DELETE_SUCCESS = "Noted. I've removed this tuition: ";
    public static final String MESSAGE_TUITION_DELETE_ERROR_NON_NUMBER = "☹ OOPS!!! "
            + "Please indicate in NUMERALS, which tuition you'd like to delete!";
    public static final String MESSAGE_TUITION_DELETE_ERROR_NO_NUMBER_GIVEN = "☹ OOPS!!! "
            + "Please indicate which tuition you'd like to delete!";
    public static final String MESSAGE_TUITION_DONE_SUCCESS = "Nice! I've marked this tuition as done:";
    public static final String MESSAGE_TUITION_DONE_ERROR_NON_NUMBER = "☹ OOPS!!! "
            + "Please indicate in NUMERALS, which tuition you'd like to set as Done!";
    public static final String MESSAGE_TUITION_DONE_ERROR_NO_NUMBER_GIVEN = "☹ OOPS!!! "
            + "Please indicate which tuition you'd like to set as Done!";
    public static final String MESSAGE_INVALID_TUITION_INDEX = "☹ OOPS!!! Please indicate a valid tuition index!";

    // Messages from Quiz related classes
    public static final String MESSAGE_INVALID_QUIZ_INDEX = "☹ OOPS!!! Please indicate a valid quiz index!";

    public static final String MESSAGE_HELP = "Hello! Here is a list of commands you can try:\n\n"
            + "\t1. Add class: 'add class /n [name of class] /s [start date-time of class] /e"
            + " [end date-time of class]'\n"
            + "\t2. Delete class: 'delete class [class number]'\n\n"
            + "\t3. Add cca: 'add cca /n [name of cca] /s [start date-time of cca] /e [end date-time of cca]'\n"
            + "\t4. Delete cca: 'delete cca [cca number]'\n\n"
            + "\t5. Add test: 'add test /n [name of test] /s [start date-time of test] /e "
            + "[end date-time of test]'\n"
            + "\t6. Delete test: 'delete test [test number]'\n\n"
            + "\t7. Add tuition: 'add tuition /n [name of tuition] /s [start date-time of tuition] /e "
            + "start date-time of tuition] /l [location of tuition]'\n"
            + "\t8. Delete tuition: 'delete tuition [tuition number]'\n\n"
            + "\t9. List events (class, test, cca, tuition): 'list'\n\n"
            + "\t10. Set class as done: 'done class [class number]'\n"
            + "\t11. Set test as done: 'done test [test number]'\n"
            + "\t12. Set cca as done: 'done cca [cca number]'\n"
            + "\t13. Set tuition as done: 'done tuition [tuition number]'\n\n"
            + "\t14. Find relevant event(s): 'find [keyword(s)]'\n\n"
            + "\t15. Add contact: 'add contact /sub [subject] /n [name of contact person] /hp [phone number]"
            + " /e [email address]'\n"
            + "\t16. Delete contact: 'delete contact [contact number]'\n"
            + "\t17. List contact: 'list contact'\n\n"
            + "\t18. Take Mathematics quiz: 'quiz [no. of questions (10, 20 or 30)]'\n"
            + "\t19. List quiz questions: 'list quiz'\n"
            + "\t20. Add quiz question: 'add quiz /q [question] /o1 [option 1] /o2 [option 2] /o3 [option 3]"
            + " /o4 [option 4] /a [option answer] /exp [explanation]'\n\n"
            + "\t21. Exit program: 'bye'\n\n"
            + "\n\tNOTE:\n\t1. Please enter the date-time in the following format: YYYY-MM-DD "
            + "[time in 24hr format]\n\te.g. 2020-08-19 1300\n\n"
            + "\t2. For command 20 (Add quiz question), the 'explanation' field is OPTIONAL\n\n";
    public static final String MESSAGE_BYE = "BYE BYE! SEE YOU NEXT TIME! :3";
}