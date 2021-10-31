package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class EightDataProvider extends DataProviderClass {

    @DataProvider(name = "positiveVolumeOfCuboidDataProvider")
    public static Object[][] positiveVolumeOfCuboidDataProvider() {
        Object[][] param = new Object[][]{
                {5, 5, 5, 125},
                {555, 555, 555, 170953875},
                {99, 99, 99, 970299}
        };
        return combine(eightImplPackageProvider(), param);
    }

    @DataProvider(name = "negativeVolumeOfCuboidDataProvider")
    public static Object[][] negativeVolumeOfCuboidDataProvider() {
        Object[][] param = new Object[][]{
                {0, 0, 0, -1},
                {-1, 5, 5, -1}
        };
        return combine(eightImplPackageProvider(), param);
    }

    @DataProvider(name = "convertAStringToaNumber")
    public static Object[][]convertAStringToANumber(){
        Object[][] param = new Object[][]{
                {"1234", 1234},
                {"605", 605},
                {"1405", 1405},
                {"-7", -7}
        };
        return combine(eightImplPackageProvider(), param);
    }

    @DataProvider(name = "positiveWilsonPrimeDataProvider")
    public static Object[][] positiveWilsonPrimeDataProvider() {
        Object[][] param = new Object[][]{
                {5, true},
                {9, false},
                {6, false}
        };
        return combine(eightImplPackageProvider(), param);
    }

    @DataProvider(name = "negativeWilsonPrimeDataProvider")
    public static Object[][] negativeWilsonPrimeDataProvider() {
        Object[][] param = new Object[][]{
                {-4, false},
                {0, false}
        };
        return combine(eightImplPackageProvider(), param);
    }

    @DataProvider(name = "positiveLiters")
    public static Object[][] positiveKeepHydrated() {
        Object[][] testData = new Object[][]{
                {4.0, 2},
                {11.0, 5},
                {200.0, 100},
                {25355354.0, 12677677},
                {0, 0},
                {1, 0},
                {0.5, 0},
                {199.8, 99}
        };
        return combine(eightImplPackageProvider(), testData);
    }

    @DataProvider(name = "negativeLiters")
    public static Object[][] negativeKeepHydrated() {
        Object[][] testData = new Object[][]{
                {-50, -1},
                {-400000, -1}
        };
        return combine(eightImplPackageProvider(), testData);
    }
    @DataProvider(name = "validDivisibleByDataProvider")
    public static Object[][] validDivisibleByDataProvider(){
        Object[][] testData = new Object[][]{
                {new int[]{1,2,3,4,5,6},2,new int[]{2,4,6}},
                {new int[]{1,2,3,4,5,6},3,new int[]{3,6}},
                {new int[]{0,1,2,3,4,5,6},4,new int[]{0,4}},
        };
        return combine(eightImplPackageProvider(), testData);
    }
    @DataProvider(name = "invalidDivisibleByDataProvider")
    public static Object[][] InvalidDivisibleByDataProvider(){
        Object[][] testData = new Object[][]{
                {new int[]{1,2,3,4,5,6},2,new int[]{1,3,2}},
                {new int[]{1,2,3,4,5,6},3,new int[]{1,6}},
        };
        return combine(eightImplPackageProvider(), testData);
    }

    @DataProvider(name = "positiveMpgToKPM")
    public static Object[][] positiveMpgToKPM(){
        Object[][] testData = new Object[][]{
                {10f, 3.54f},
                {20f, 7.08f},
                {0f, 0f}
        };
        return combine(eightImplPackageProvider(), testData);
    }
    @DataProvider(name = "negativeDivisibleByDataProvider")
    public static Object[][] negativeDivisibleByDataProvider(){
        Object[][] testData = new Object[][]{
                {new int[]{-1,-2,-3,-4,5,6},2,new int[]{-2,-4,6}},
                {new int[]{1,-2,-3,4,5,6},-3,new int[]{-3,6}},
        };
        return combine(eightImplPackageProvider(), testData);
    }

    @DataProvider(name = "positiveTwoDecimalPlaces")
    public static Object[][] positiveTwoDecimalPlaces(){
        Object[][] testData = new Object[][]{
                {4.659725356, 4.66},
                {173735326.3783732637948948, 173735326.38},
                {0, 0.00},
        };
        return combine(eightImplPackageProvider(), testData);
    }
    @DataProvider(name = "negativeTwoDecimalPlaces")
    public static Object[][] negativeTwoDecimalPlaces(){
        Object[][] testData = new Object[][]{
                {-4.659725356, -4.66},
                {-173735326.3783732637948948, -173735326.38},
                {-1124124.254623626, -1124124.25},
        };
        return combine(eightImplPackageProvider(), testData);
    }

    @DataProvider(name = "negativeMpgToKPM")
    public static Object[][] negativeMpgToKPM(){
        Object[][] testData = new Object[][]{
                {-5f, -1},
                {-9879.324f, -1}
        };
        return combine(eightImplPackageProvider(), testData);
    }

    @DataProvider()
    public static Object[][] positiveSquareOrSquareRoot(){
        Object[][] testData = new Object[][]{
                {new int[]{4, 3, 9, 7, 2, 1}, new int[]{2, 9, 3, 49, 4, 1}},
                {new int[]{100, 101, 5, 5, 1, 1}, new int[]{10, 10201, 25, 25, 1, 1}},
                {new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 4, 9, 2, 25, 36}}
        };
        return combine(eightImplPackageProvider(), testData);
    }

    @DataProvider()
    public static Object[][] negativeSquareOrSquareRoot(){
        Object[][] testData = new Object[][]{
                {new int[]{-1, -2, -3, -4, -5, -6}, new int[0]},
                {new int[0], new int[0]},
                {new int[]{1, 2, 3, 4, 0, 6}, new int[0]}
        };
        return combine(eightImplPackageProvider(), testData);
    }
}
