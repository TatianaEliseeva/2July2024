import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

@DisplayName()
public class SecondTestWithTestData {
    @BeforeEach
    @CsvFileSource
    @ParameterizedTest
}
