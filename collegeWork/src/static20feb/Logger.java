package static20feb;

public class Logger {
	 private static Logger instance;
	    private Logger() {}

	    public static Logger getInstance() {
	        if (instance == null) instance = new Logger();
	        return instance;
	    }

	    void log(String msg) { System.out.println("LOG: " + msg); }

	    public static void main(String[] args) {
	        Logger a = Logger.getInstance();
	        Logger b = Logger.getInstance();
	        a.log("Hello");
	        System.out.println(a == b); // true — same instance
	    }

}
