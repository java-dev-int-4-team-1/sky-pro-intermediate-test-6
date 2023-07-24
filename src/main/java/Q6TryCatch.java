import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;


public class Q6TryCatch {
    static Logger  logger = LoggerFactory.getLogger(Q6TryCatch.class);

    public static void main(String[] args) {
        System.out.println("Try-catch");

        try {
            method1();
        }
        catch (IllegalStateException e) {
            logger.error("Arithmetic- or IllegalArgumentException was thrown", e);

        }
        catch (NullPointerException e) {
            logger.error("NPE", e);
        }
       finally {
          logger.info("finally-1-block");
       }

       try(InputStream in = new FileInputStream("src/main/java/Q6TryCatch.java");
       OutputStream out = new FileOutputStream("Q6TryCatch-copy.java")) {
           final int bufSize = 100;
           byte[] buf = new byte[bufSize];
           int n;
           while((n = in.read(buf, 0, bufSize)) > 0) {
               out.write(buf, 0, n);
           }
       }
       catch (IOException e) {
           logger.error("IOException was thrown", e);
       }
       finally {
           logger.info("finally-2-block");
       }

    }

    private static void method1() {
        throw new IllegalStateException("Just an example. Do not worry about-)");
    }
}
