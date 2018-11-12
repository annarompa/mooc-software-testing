package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {

    @ParameterizedTest(name = "string={0}, expectedResult={1}")
    @CsvSource({"azza,az", "aba,ab", "aaxzaa,aa", "abcXZycba,abc"})
    public void test(String string, String expectedResult) {
        String result = new Mirror().mirrorEnds(string);
        Assertions.assertEquals(expectedResult, result);
    }
}
