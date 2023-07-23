import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Q2StackTraceExample {
    static Logger logger = LoggerFactory.getLogger(Q2StackTraceExample.class);
    public static void main(String[] args) {
        try {
            method1();
        }
        catch (RuntimeException | IOException e) {
            e.printStackTrace();
            logger.error("Some exception caught", e);
        }
    }

    private static void method1() throws IOException {
        try {
            method2();
        }
        catch(Exception e) {
            e.printStackTrace();
            throw e;

        }
    }

    private static void method2() {
        throw new IllegalStateException("It's just an example. Do not worry about!");
    }
}
