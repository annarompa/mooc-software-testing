package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MakeChocolateTest {

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")


    @CsvSource({"4,1,9,4", "4, 1, 10, -1", "4, 1, 7,2"})
    public void test(int small, int big, int total, int expectedResult) {
        int result = new ChocolateBags().makeChocolate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }
}
