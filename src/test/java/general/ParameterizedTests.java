package general;

import com.example.junit_study.math.SimpleMath;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.util.StringUtils;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ParameterizedTests {


    //value source
    @ParameterizedTest
    @ValueSource(strings = {"radars are useful", "testing parameterized test", "i am studying", "white spaced"})
    void containsWhiteSpaceTest(String word){
        assertTrue(StringUtils.containsWhitespace(word));
    }


    //method source
    @ParameterizedTest
    @MethodSource("testParameterizedWithMethodSource")
    void testDivision(double n1, double n2, double expected){
        SimpleMath math = new SimpleMath();

        double actual = math.division(n1, n2);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> testParameterizedWithMethodSource(){
        return Stream.of(
                arguments(4.2, 1, 4.2),
                arguments(4, 2, 2),
                arguments(-8, 4, -2),
                arguments(-9, 3, -3)
        );
    }

    //csv source
    //este teste irá falhar pois a fruit numero 1 está definida como null
    //por conta do atributo nullvalues que indica que a strig null será tratada como null de fato
    @ParameterizedTest
    @CsvSource(value = {
            "null, 1",
            "banana, 2",
            "orange, 3"
    }, nullValues = "null")
    void testWithCsvSource(String fruit, int rank) {
        assertAll(
                () -> assertNull(fruit),
                () -> assertTrue(rank > 0)
        );
    }

    @ParameterizedTest
    @CsvSource(value = {
            "apple, 1",
            "banana, 2",
            "orange, 3"
    })
    void testWithCsvSource2(String fruit, int rank) {
        assertAll(
                () -> assertNotNull(fruit),
                () -> assertTrue(rank > 0)
        );
    }
}
