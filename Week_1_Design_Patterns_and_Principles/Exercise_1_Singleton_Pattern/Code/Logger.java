public class Logger {
    // private static instance of Logger
    private static Logger instance;

    // private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger Initialized.");
    }

    // public method to return the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // lazy initialization
        }
        return instance;
    }

    // sample method for logging
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
