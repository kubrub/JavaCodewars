package com.ss.ita.kata;

import com.ss.ita.implementation.ImplementationEightKata;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EightTest extends EightDataProvider {

    @Test(dataProvider = "positiveLiters")
    public void positiveTestLiters(ImplementationEightKata imp, double time, int expected) {
        Assert.assertEquals(imp.liters(time), expected);
    }
    @Test(dataProvider = "negativeLiters")
    public void negativeTestKeepLiters(ImplementationEightKata imp, double time, int expected) {
        Assert.assertEquals(imp.liters(time), expected);
    }

    @Test(dataProvider = "positiveVolumeOfCuboidDataProvider")
    public void positiveTestGetVolumeOfCuboid(ImplementationEightKata imp, int a, long b, long c, long expected) {
        Assert.assertEquals(imp.getVolumeOfCuboid(a, b, c), expected);
    }

    @Test(dataProvider = "negativeVolumeOfCuboidDataProvider")
    public void negativeTestGetVolumeOfCuboid(ImplementationEightKata imp, int a, long b, long c, long expected) {
        Assert.assertEquals(imp.getVolumeOfCuboid(a, b, c), expected);
    }

    @Test(dataProvider = "positiveMpgToKPM")
    public void positiveTestMpgToKPM(ImplementationEightKata imp, float a, float expected) {
        Assert.assertEquals(imp.mpgToKPM(a), expected);
    }

    @Test(dataProvider = "negativeMpgToKPM")
    public void negativeTestMpgToKPM(ImplementationEightKata imp, float a, float expected) {
        Assert.assertEquals(imp.mpgToKPM(a), expected);
    }

    @Test(dataProvider = "positiveSquareOrSquareRoot")
    public void positiveTestSquareOrSquareRoot(ImplementationEightKata imp, int[] actual, int[] expected) {
        Assert.assertEquals(imp.squareOrSquareRoot(actual),expected);
    }

    @Test(dataProvider = "negativeSquareOrSquareRoot")
    public void negativeTestSquareOrSquareRoot(ImplementationEightKata imp, int[] actual, int[] expected) {
        Assert.assertEquals(imp.squareOrSquareRoot(actual),expected);
    }

    @Test
    public void testCountPositivesSumNegatives() {
    }

    @Test(dataProvider = "convertAStringToaNumber")
    public void testStringToNumber(ImplementationEightKata imp, String str, int expected) {
        Assert.assertEquals(imp.stringToNumber(str), expected);
    }

    @Test(dataProvider = "positiveWilsonPrimeDataProvider")
    public void positiveTestAmIWilson(ImplementationEightKata impl, double n, boolean expected) {
        Assert.assertEquals(impl.amIWilson(n), expected);
    }

    @Test(dataProvider = "negativeWilsonPrimeDataProvider")
    public void negativeTestAmIWilson(ImplementationEightKata impl, double n, boolean expected) {
        Assert.assertEquals(impl.amIWilson(n), expected);
    }

    @Test(dataProvider = "positiveTwoDecimalPlaces")
    public void positiveTestTwoDecimalPlaces(ImplementationEightKata imp, double number, double expected) {
        Assert.assertEquals(imp.twoDecimalPlaces(number), expected);
    }

    @Test(dataProvider = "negativeTwoDecimalPlaces")
    public void negativeTestTwoDecimalPlaces(ImplementationEightKata imp, double number, double expected) {
        Assert.assertEquals(imp.twoDecimalPlaces(number), expected);
    }

    @Test(dataProvider = "validDivisibleByDataProvider")
    public void positiveTestDivisibleBy(ImplementationEightKata imp, int[] numbers, int divider, int[] expected) {
        Assert.assertEquals(imp.divisibleBy(numbers, divider), expected);
    }

    @Test(dataProvider = "invalidDivisibleByDataProvider")
    public void testDivisibleByInvalid(ImplementationEightKata imp, int[] numbers, int divider, int[] expected) {
        Assert.assertNotEquals(imp.divisibleBy(numbers, divider), expected);
    }

    @Test(dataProvider = "negativeDivisibleByDataProvider")
    public void testDivisibleByNegative(ImplementationEightKata imp, int[] numbers, int divider, int[] expected) {
        Assert.assertEquals(imp.divisibleBy(numbers, divider), expected);
    }
}
