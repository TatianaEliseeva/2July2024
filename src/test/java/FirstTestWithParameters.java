import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Search")
public class FirstTestWithParameters {
    @BeforeEach
    public void setup() {
        open();

    }
    @ValueSource// Data provider = ValueSource
    @ParameterizedTest
}
