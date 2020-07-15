package com.bridgelabz.unitmeasurement.utility;

import com.bridgelabz.unitmeasurement.service.QuantityMeasurement;

import java.util.Objects;

public enum Unit {
    FEET(12, TypesOfUnit.LENGTH), INCH(1, TypesOfUnit.LENGTH), YARD(36, TypesOfUnit.LENGTH), CM(0.4, TypesOfUnit.LENGTH), GALLON(3.78, TypesOfUnit.VOLUME), LITRE(1, TypesOfUnit.VOLUME), ML(0.001, TypesOfUnit.VOLUME);

    private final double value;
    private final TypesOfUnit typesOfUnit;

    Unit(double value, TypesOfUnit typesOfUnit) {
        this.value = value;
        this.typesOfUnit = typesOfUnit;
    }

    /**
     *
     * @param lenObj
     * @return
     */
    public static double getValue(QuantityMeasurement lenObj) {
        return lenObj.unit.value * lenObj.value;
    }

    /**
     *
     * @param quantityObj1
     * @param quantityObj2
     * @return
     */
    public static boolean compare (QuantityMeasurement quantityObj1, QuantityMeasurement quantityObj2) {
        double value1 = getValue(quantityObj1);
        double value2 = getValue(quantityObj2);
        return Objects.equals(value1, value2);
    }

    /**
     *
     * @param quantityObj1
     * @param quantityObj2
     * @return
     */
    public static double add(QuantityMeasurement quantityObj1, QuantityMeasurement quantityObj2) {
        double firstValue = getValue(quantityObj1);
        double secondValue = getValue(quantityObj2);
        return firstValue + secondValue;
    }
}
