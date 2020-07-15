package com.bridgelabz.unitmeasurement.utility;

import com.bridgelabz.unitmeasurement.service.Length;

import java.util.Objects;

public enum Unit {
    FEET(12), INCH(1), YARD(36), CM(0.4), GALLON(3.78), LITRE(1), ML(0.001);

    private final double value;

    Unit(double value) {
        this.value = value;
    }

    /**
     *
     * @param lenObj
     * @return
     */
    public static double getValue(Length lenObj) {
        return lenObj.unit.value * lenObj.value;
    }

    /**
     *
     * @param lenObj1
     * @param lenObj2
     * @return
     */
    public static boolean compare (Length lenObj1, Length lenObj2) {
        double value1 = getValue(lenObj1);
        double value2 = getValue(lenObj2);
        return Objects.equals(value1, value2);
    }

    /**
     *
     * @param lenObj1
     * @param lenObj2
     * @return
     */
    public static double add(Length lenObj1, Length lenObj2) {
        double firstValue = getValue(lenObj1);
        double secondValue = getValue(lenObj2);
        return firstValue + secondValue;
    }
}
