package com.ss.ita.kata;

import com.ss.ita.implementation.ImplementationSixKata;
import org.testng.Assert;
import org.testng.annotations.Test;

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

    @Test(dataProvider = "validFloatingPointApproximation")
    public void testF(ImplementationSixKata imp, double x, double expected) {
        Assert.assertEquals(imp.f(x),expected);
    }

    @Test(dataProvider = "invalidFloatingPointApproximation")
    public void invalidTestF(ImplementationSixKata imp, double x, double expected) {
        Assert.assertEquals(imp.f(x),expected);
    }

    @Test(dataProvider = "meanDataProvider")
    public void testMean(ImplementationSixKata impl, String town, String data, double expected) {
        Assert.assertEquals(impl.mean(town, data), expected);
    }

    @Test(dataProvider = "invalidMeanDataProvider")
    public void invalidTestMean(ImplementationSixKata impl, String town, String data, double expected) {
        Assert.assertEquals(impl.mean(town, data), expected);
    }

    @Test(dataProvider = "varianceDataProvider")
    public void testVariance(ImplementationSixKata impl, String town, String data, double expected) {
        Assert.assertEquals(impl.variance(town, data), expected);
    }

    @Test(dataProvider = "invalidVarianceDataProvider")
    public void invalidTestVariance(ImplementationSixKata impl, String town, String data, double expected) {
        Assert.assertEquals(impl.variance(town, data), expected);
    }

    @Test(dataProvider = "validNbaCupDataProvider")
    public void testNbaCup(ImplementationSixKata imp,String resultSheet, String toFind,String expected) {
        Assert.assertEquals(imp.nbaCup(resultSheet,toFind), expected);
    }
    @Test(dataProvider = "inValidNbaCupDataProvider")
    public void NegativeTestNbaCup(ImplementationSixKata imp, String resultSheet,String toFind,String expected) {
        Assert.assertEquals(imp.nbaCup(resultSheet,toFind), expected);
    }

    @Test(dataProvider = "validHelpBooksellerDataProvider")
    public void testStockSummary(ImplementationSixKata imp, String[] lstOfArt, String[] lstOf1stLetter,String expected) {
        Assert.assertEquals(imp.stockSummary(lstOfArt, lstOf1stLetter),expected);
    }
    @Test(dataProvider = "invalidHelpBooksellerDataProvider")
    public void testStockSummaryInvalid(ImplementationSixKata imp, String[] lstOfArt, String[] lstOf1stLetter,String expected) {
        Assert.assertEquals(imp.stockSummary(lstOfArt, lstOf1stLetter),expected);
    }
}