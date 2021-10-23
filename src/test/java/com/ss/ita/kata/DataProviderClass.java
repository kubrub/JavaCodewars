package com.ss.ita.kata;

import com.ss.ita.implementation.ImplementationEightKata;
import com.ss.ita.implementation.ImplementationSevenKata;
import com.ss.ita.implementation.ImplementationSixKata;
import com.ss.ita.implementation.ImplementationFiveKata;

import org.testng.annotations.DataProvider;
import java.util.LinkedList;
import java.util.List;

public class DataProviderClass {

    @DataProvider(name = "eightImplPackageProvider")
    public static Object[][] eightImplPackageProvider() {
        ImplementationEightKata[][] objects;
        objects = new ImplementationEightKata[][]{
                {new ImplementationEightKata()}
        };
        return objects;
    }

    @DataProvider(name = "sevenImplPackageProvider")
    public static Object[][] sevenImplPackageProvider() {
        ImplementationSevenKata[][] objects;
        objects = new ImplementationSevenKata[][]{
                {new ImplementationSevenKata()}
        };
        return objects;
    }

    @DataProvider(name = "sixImplPackageProvider")
    public static Object[][] sixImplPackageProvider() {
        ImplementationSixKata[][] objects = new ImplementationSixKata[][]{{new ImplementationSixKata()}};
        return objects;
    }

    @DataProvider(name = "fiveImplPackageProvider")
    public static Object[][] fiveImplPackageProvider() {
        ImplementationFiveKata[][] objects = new ImplementationFiveKata[][]{{new ImplementationFiveKata()}};
        return objects;
    }

    public static Object[][] combine(Object[][] impls, Object[][] data) {
        List<Object[]> matrix = new LinkedList<Object[]>();
        for (Object[] imp : impls) {
            for (Object[] inputParam : data) {
                int totalLength = imp.length + inputParam.length;
                Object[] temp = new Object[totalLength];
                temp[0] = imp[0];
                for (int i = 1; i < temp.length; i++) {
                    temp[i] = inputParam[i - 1];
                }
                matrix.add(temp);
            }
        }
        return matrix.toArray(new Object[0][0]);
    }
}
