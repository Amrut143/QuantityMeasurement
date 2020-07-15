package com.bridgelabz.unitmeasurement.utility;

import com.bridgelabz.unitmeasurement.service.QuantityMeasurement;

public enum Unit {
    FEET(12, TypesOfUnit.LENGTH), INCH(1, TypesOfUnit.LENGTH), YARD(36, TypesOfUnit.LENGTH), CM(0.4, TypesOfUnit.LENGTH),
    GALLON(3.78, TypesOfUnit.VOLUME), LITRE(1, TypesOfUnit.VOLUME), ML(0.001, TypesOfUnit.VOLUME),
    KG(1, TypesOfUnit.WEIGHT), GRAM(0.001, TypesOfUnit.WEIGHT), TONNE(1000, TypesOfUnit.WEIGHT),
    CELSIUS(2.12, TypesOfUnit.TEMPERATURE), FAHRENHEIT(1, TypesOfUnit.TEMPERATURE);

    private final double value;
    public final TypesOfUnit typesOfUnit;

    Unit(double value, TypesOfUnit typesOfUnit) {
        this.value = value;
        this.typesOfUnit = typesOfUnit;
    }

    /**
     *
     * @param quantityObj
     * @return
     */
    public static double getValue(QuantityMeasurement quantityObj) {
        return quantityObj.unit.value * quantityObj.value;
    }
}
