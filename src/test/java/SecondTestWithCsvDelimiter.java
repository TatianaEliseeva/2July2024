import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName()
public class SecondTestWithCsvDelimiter {
    @BeforeEach
    @CsvSource

    delimiter = '|'

    @ParameterizedTest
}
