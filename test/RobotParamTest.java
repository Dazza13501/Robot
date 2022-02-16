import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RobotParamTest {

    private String expected;
    private int age;


    @ParameterizedTest
    @CsvSource({"10,Age ok", "20,Age ok", "25,Too old"})
    void testcheckageAll( int age, String expected) {
        Robot buddy = new Robot("buddy", age);
        assertEquals(expected, buddy.checkage() );

    }
    @ParameterizedTest
    @CsvFileSource(resources ="ParamTestFile.csv", numLinesToSkip = 1 )
    void testcheckageAll2( int age, String expected) {
        Robot buddy = new Robot("buddy", age);
        assertEquals(expected, buddy.checkage() );

    }
    @ParameterizedTest
    @CsvSource({"4,10000.00","5,10000.00", "7, 7500.00", "10,7500.00", "11, 5000.00", "20,5000.00"})
    void testcostageAll( int age, double expected) {
        Robot buddy = new Robot("buddy", age);
        assertEquals(expected, buddy.checkCost());

    }

}
