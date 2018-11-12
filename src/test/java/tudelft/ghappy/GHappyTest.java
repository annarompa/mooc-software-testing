package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest(name = "string={0}, expectedResult={1}")
    @CsvSource({"xxggxx,true", "xxgxx,false", "xxggyygxx,false", "ggg,true"})
    public void test(String string, boolean expectedResult) {
        boolean result = new GHappy().gHappy(string);
        Assertions.assertEquals(expectedResult, result);
    }
}
