
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

@DisplayName()
public class ThirdTestWithMetodSource {

    static Stream<Arguments> MethodName() {
        return Stream.of(
                Arguments.of()
                Arguments.of()
        );
    }

    @MethodSource
    @ParameterizedTest
    void MethodName(Locale locale, List<String> expectedButtons);
}
