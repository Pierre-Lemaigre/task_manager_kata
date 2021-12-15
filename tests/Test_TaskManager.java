import org.junit.jupiter.api.Test;

public class Test_TaskManager {

    @Test
    public void test_parseUserInput() {
        // Arrange
        String actionUserInput = "+ description";

        // Act
        Action action = Parser.parseUserInput(actionUserInput);

        // Assert
        assert action == Action.ADD_TASK;
    }

}
