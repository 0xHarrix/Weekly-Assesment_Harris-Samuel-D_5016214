public class Logger {
    private static Logger instance;
    
    private Logger() { }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }
}

// SingletonPatternExample.java
public class SingletonPatternExample {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        logger1.log("Logger 1 instance");
        logger2.log("Logger 2 instance");

        System.out.println(logger1 == logger2); // true
    }
}
