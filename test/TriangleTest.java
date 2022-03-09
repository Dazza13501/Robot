import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {


    private String expected;

    @ParameterizedTest
    @CsvSource({"Error"})
    void testriangle1(String expected) {
        Triangle triangle1 = new Triangle(-2, 4,7);
        assertEquals(expected, triangle1.classify());

    }
    @ParameterizedTest
    @CsvSource({"scalene"})
    void testriangle2(String expected) {
        Triangle triangle2 = new Triangle(22, 8,16);
        assertEquals(expected, triangle2.classify());

    }
    @ParameterizedTest
    @CsvSource({"isosceles"})
    void testriangle3( String expected) {
        Triangle triangle3 = new Triangle(10, 10,3);
        assertEquals(expected, triangle3.classify());

    }
    @ParameterizedTest
    @CsvSource({"equilateral"})
    void testriangle4(String expected) {
        Triangle triangle4 = new Triangle(15, 15,15);
        assertEquals(expected, triangle4.classify());

    }

}


