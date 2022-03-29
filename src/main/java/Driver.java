
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.security.NoSuchAlgorithmException;

public class Driver {
    private static final Logger logger = LogManager.getLogger(Driver.class);

    public static void main(String[] args) throws NoSuchAlgorithmException {
        logger.info("Starting Application");
        Application run = new Application();
        run.run();
    }
}

