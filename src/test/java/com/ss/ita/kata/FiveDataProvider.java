package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

import java.math.BigInteger;

public class FiveDataProvider extends DataProviderClass {

    @DataProvider(name = "positiveFindTheSmallest")
    public static Object[][] positiveFindTheSmallest(){
        Object[][] param = new Object[][]{
                {261235, "[126235, 2, 0]"},
                {285365, "[238565, 3, 1]"},
                {269045, "[26945, 3, 0]"},
                {296837, "[239687, 4, 1]"}
        };
        return combine(fiveImplPackageProvider(), param);
    }
    @DataProvider(name = "negativeFindTheSmallest")
    public static Object[][] negativeFindTheSmallest(){
        Object[][] param = new Object[][]{
                {-261235, "[]"},
                {-285365, "[]"},
                {-269045, "[]"},
                {-296837, "[]"}
        };
        return combine(fiveImplPackageProvider(), param);
    }

    @DataProvider(name = "positiveGap")
    public static Object[][] positiveGap() {
        Object[][] param = {
                {2, 100, 110, new long[]{101, 103}},
                {4, 100, 110, new long[]{103, 107}},
                {8, 300, 400, new long[]{359, 367}},
                {10, 300, 400, new long[]{337, 347}}
        };
        return combine(fiveImplPackageProvider(), param);
    }

    @DataProvider(name = "negativeGap")
    public static Object[][] negativeGap() {
        Object[][] param = {
                {6, 100, 110, null},
                {1, 110, 100, null},
        };
        return combine(fiveImplPackageProvider(), param);
    }

    @DataProvider(name = "positiveArtificialRain")
    public static Object[][] positiveArtificialRain(){
        Object[][] testData = new Object[][]{
                {new int[]{1,2,1,2,1}, 3},
                {new int[]{0}, 1},
                {new int[]{9,5,4,3,8}, 4},
                {new int[]{1,1,1,1}, 4},
                {new int[]{0,0,0,0},4},
                {new int[]{12,13,11,10},4},
                {new int[]{},0}
        };
        return combine(fiveImplPackageProvider(), testData);
    }

    @DataProvider(name = "positivePerimeter")
    public static Object[][] positivePerimeter() {
        Object[][] testData = {
                {BigInteger.valueOf(5), BigInteger.valueOf(80)},
                {BigInteger.valueOf(7), BigInteger.valueOf(216)},
                {BigInteger.valueOf(30), BigInteger.valueOf(14098308)}
        };
        return combine(fiveImplPackageProvider(), testData);
    }
    @DataProvider(name = "negativePerimeter")
    public static Object[][] negativePerimeter() {
        Object[][] testData = {
                {BigInteger.valueOf(0), BigInteger.valueOf(0)},
                {BigInteger.valueOf(-15), BigInteger.valueOf(0)}
        };
        return combine(fiveImplPackageProvider(), testData);
    }

    @DataProvider(name = "positiveZeros")
    public static Object[][] positiveZeros(){
        Object[][] testData = new Object[][]{
                {6, 1},
                {12, 2},
                {20, 4}
        };
        return combine(fiveImplPackageProvider(), testData);
    }

    @DataProvider(name = "negativeZeros")
    public static Object[][] negativeZeros(){
        Object[][] testData = new Object[][]{
                {-1, -1},
                {-999, -1}
        };
        return combine(fiveImplPackageProvider(), testData);
    }
}
