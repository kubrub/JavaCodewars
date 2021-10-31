package com.ss.ita.kata;

import com.ss.ita.implementation.ImplementationSixKata;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.ss.ita.implementation.ImplementationSixKata.isPrime;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SixTest extends SixDataProvider {
    @Test(dataProvider = "positiveFindNb")
    public void positiveTestFindNb(ImplementationSixKata impl, long actual, long expected) {
        Assert.assertEquals(impl.findNb(actual),expected);
    }
    @Test(dataProvider = "negativeFindNb")
    public void negativeTestFindNb(ImplementationSixKata impl, long actual, long expected) {
        Assert.assertEquals(impl.findNb(actual),expected);
    }

    @Test
    public void testBalance() {
    }

    @Test(dataProvider = "positiveFloatingPointApproximation")
    public void testF(ImplementationSixKata imp, double x, double expected) {
        Assert.assertEquals(imp.f(x),expected);
    }

    @Test(dataProvider = "negativeFloatingPointApproximation")
    public void invalidTestF(ImplementationSixKata imp, double x, double expected) {
        Assert.assertEquals(imp.f(x),expected);
    }

    @Test(dataProvider = "positiveMeanDataProvider")
    public void testMean(ImplementationSixKata impl, String town, String data, double expected) {
        Assert.assertEquals(impl.mean(town, data), expected);
    }

    @Test(dataProvider = "negativeMeanDataProvider")
    public void negativeTestMean(ImplementationSixKata impl, String town, String data, double expected) {
        Assert.assertEquals(impl.mean(town, data), expected);
    }

    @Test(dataProvider = "positiveVarianceDataProvider")
    public void testVariance(ImplementationSixKata impl, String town, String data, double expected) {
        Assert.assertEquals(impl.variance(town, data), expected);
    }

    @Test(dataProvider = "negativeVarianceDataProvider")
    public void invalidTestVariance(ImplementationSixKata impl, String town, String data, double expected) {
        Assert.assertEquals(impl.variance(town, data), expected);
    }

    @Test(dataProvider = "positiveNbaCupDataProvider")
    public void testNbaCup(ImplementationSixKata imp,String resultSheet, String toFind,String expected) {
        Assert.assertEquals(imp.nbaCup(resultSheet,toFind), expected);
    }
    @Test(dataProvider = "negativeNbaCupDataProvider")
    public void negativeTestNbaCup(ImplementationSixKata imp, String resultSheet,String toFind,String expected) {
        Assert.assertEquals(imp.nbaCup(resultSheet,toFind), expected);
    }

    @Test(dataProvider = "positiveHelpBooksellerDataProvider")
    public void testStockSummary(ImplementationSixKata imp, String[] lstOfArt, String[] lstOf1stLetter,String expected) {
        Assert.assertEquals(imp.stockSummary(lstOfArt, lstOf1stLetter),expected);
    }
    @Test(dataProvider = "negativeHelpBooksellerDataProvider")
    public void testStockSummaryInvalid(ImplementationSixKata imp, String[] lstOfArt, String[] lstOf1stLetter,String expected) {
        Assert.assertEquals(imp.stockSummary(lstOfArt, lstOf1stLetter),expected);
    }
    @Test
    public void positiveTestPrime() {
        assertTrue("3 is prime", isPrime(3));
        assertTrue("5 is prime", isPrime(5));
        assertTrue("7 is prime", isPrime(7));
        assertTrue("41 is prime", isPrime(41));
        assertTrue("5099 is prime", isPrime(5099));
    }

    @Test
    public void negativeTestPrime() {
        assertFalse("4 is not prime", isPrime(4));
        assertFalse("6 is not prime", isPrime(6));
        assertFalse("8 is not prime", isPrime(8));
        assertFalse("9 is not prime", isPrime(9));
        assertFalse("45 is not prime", isPrime(45));
        assertFalse("-5 is not prime", isPrime(-5));
        assertFalse("-8 is not prime", isPrime(-8));
        assertFalse("-41 is not prime", isPrime(-41));
    }
}