
import Util.ConnectionFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.sql.DriverManager;


public class ConnectionFactoryTest {
    @Test
    public void CheckingThatWhenWeCallTheConnectionNoExceptionIsThrown(){
        Executable executable =new Executable() {
            @Override
            public void execute() throws Throwable {
                ConnectionFactory.getConnection();
            }
        };

        Assertions.assertDoesNotThrow(executable);
    }
}