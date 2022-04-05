import model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Repository.UserRepository;

public class UserRepositoryTest {


    private UserRepository UserRepository;


    @BeforeEach
    public void setup() {
        // each time a new object is created User-
        UserRepository = new UserRepository();
    }
    @Test
    public void TestingThatWhenCreatingTheUserNoExceptionIsThrown()
    {
        User user=new User("Admin","Password");

        Assertions.assertDoesNotThrow(()->UserRepository.create(user));
    }
}