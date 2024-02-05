package hw.creationals;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    protected int num = 1;
    private static Logger logger;

    private Logger() {
    }

    public void log(String msg) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("[" + dateTime.format(DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm:s"))
                + " " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
