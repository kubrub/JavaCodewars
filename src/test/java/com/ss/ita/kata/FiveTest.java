package com.ss.ita.kata;

import com.ss.ita.implementation.ImplementationFiveKata;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;
import java.util.Arrays;

public class FiveTest extends FiveDataProvider {

    @Test(dataProvider = "positiveArtificialRain")
    public void positiveTestArtificialRain(ImplementationFiveKata imp, final int[] arr, int expected) {
        Assert.assertEquals(imp.artificialRain(arr), expected);
    }

    @Test(dataProvider = "positiveGap")
    public void testPositiveGap(ImplementationFiveKata imp, int g, long m, long n, long[] expected) {
        Assert.assertEquals(imp.gap(g, m, n), expected);
    }

    @Test(dataProvider = "negativeGap")
    public void testNegativeGap(ImplementationFiveKata imp, int g, long m, long n, long[] expected) {
        Assert.assertEquals(imp.gap(g, m, n), expected);
    }

    @Test(dataProvider = "positiveZeros")
    public void positiveTestZeros(ImplementationFiveKata imp, int a, int expected) {
        Assert.assertEquals(imp.zeros(a), expected);
    }

    @Test(dataProvider = "negativeZeros")
    public void negativeTestZeros(ImplementationFiveKata imp, int a, int expected) {
        Assert.assertEquals(imp.zeros(a), expected);
    }

    @Test(dataProvider = "positivePerimeter")
    public void positiveTestPerimeter(ImplementationFiveKata impl, BigInteger actual, BigInteger expected) {
        Assert.assertEquals(impl.perimeter(actual), expected);
    }
    @Test(dataProvider = "negativePerimeter")
    public void negativeTestPerimeter(ImplementationFiveKata impl, BigInteger actual, BigInteger expected) {
        Assert.assertEquals(impl.perimeter(actual), expected);
    }

    @Test
    public void testSolveSum() {
    }

    @Test(dataProvider = "positiveFindTheSmallest")
    public void testSmallest(ImplementationFiveKata imp, long n, String res) {
        Assert.assertEquals(Arrays.toString(imp.smallest(n)), res);
    }

    @Test(dataProvider = "negativeFindTheSmallest")
    public void negativeTestSmallest(ImplementationFiveKata imp, long n, String res){
        Assert.assertEquals(Arrays.toString(imp.smallest(n)), res);
    }
}
