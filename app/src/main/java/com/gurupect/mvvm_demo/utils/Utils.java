package com.gurupect.mvvm_demo.utils;

import java.math.BigDecimal;

public class Utils {

    public static String getValueInTwoDecimal(double value) {
        return String.format("%.2f", value);
    }

    public static String getValueInTwoDecimal(BigDecimal value) {
        return String.format("%.2f", value);
    }

    public static int getValueInInteger(BigDecimal value) {
        double doubleVal = value.doubleValue();
        return (int) doubleVal;
    }
}
