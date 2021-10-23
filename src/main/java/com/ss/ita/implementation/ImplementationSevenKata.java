package com.ss.ita.implementation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ImplementationSevenKata {
    public static String maskify(String string) {
        if (string.length() < 4) {
            return string;
        }
        else {
            String newString = "";
            for (int i = 0; i < string.length(); i++) {
                if (i >= 4) {
                    newString += "#";
                }
            }
            newString += string.substring(string.length() - 4);
            return newString;
        }
    }
    public long newAvg(double[] arr, double navg) {
        if (arr.length == 0 || navg <= 0)
            throw new IllegalArgumentException();
        double temp  = 0;
        for(int i = 0; i < arr.length; i++){
            temp += arr[i];
        }
        double expectedResult  = navg * (arr.length + 1);
        long res = (long) (expectedResult - temp);
        if (res <= 0)
            throw new IllegalArgumentException();
        return res;
    }


    public String seriesSum(int n) {
        if(n <= 0)
            return "0.00";
        double result = 0;
        int denominator = 1;
        while (n > 0){
            result += 1.0 / denominator;
            denominator += 3;
            n--;
        }
        return BigDecimal.valueOf(result).setScale(2, RoundingMode.HALF_UP).toString();
    }

    public int whereIsHe(int p, int bef, int aft) {
        int res = 0;
        int a = 0;
        int b = 0;
        for(int i = 1; i <= p; i++) {
            a = i - 1;
            b = p - i;
            if(a >= bef && b <= aft) {
                res++;
            }
        }
        return res;
    }
}
