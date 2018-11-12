package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "string={0}, shift={1}, expectedResult={2}")
    @CsvSource({"abc,3,def","xyz,3,abc", "asd;,3,invalid", "a,0,a"})
    void test(String string, int shift, String expectedResult) {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String result = csc.caesarShiftCipher(string, shift);
        Assertions.assertEquals(expectedResult, result);
    }
}
