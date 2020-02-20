package Util;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class CompareNumbersTest {

    @Test
    public void testCompareNumbers() {
        //greater than
        Assert.assertEquals(CompareNumbers.compareNumbers(50.0,37.625), "50.0 > 37.625");

        // less than
        Assert.assertEquals(CompareNumbers.compareNumbers(30.0, 37.625), "30.0 < 37.625");

        //equal to
        Assert.assertEquals(CompareNumbers.compareNumbers(30.0, 30.0), "30.0 = 30.0");
    }

}
