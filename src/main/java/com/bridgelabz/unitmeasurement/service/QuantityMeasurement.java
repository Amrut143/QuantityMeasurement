package com.bridgelabz.unitmeasurement.service;

import com.bridgelabz.unitmeasurement.exception.QuantityMeasurementException;
import com.bridgelabz.unitmeasurement.utility.Unit;

import java.util.Objects;

public class QuantityMeasurement implements IQuantityMeasurement {

    public final Unit unit;
    public final double value;

    /**
     *
     * @param unit
     * @param value
     */
    public QuantityMeasurement(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     *
     * @param that
     * @return
     */
    @Override
    public boolean compare(QuantityMeasurement that) throws QuantityMeasurementException {
        if (this.unit.typesOfUnit.equals(that.unit.typesOfUnit)) {
            double value1 = Unit.getValue(this);
            double value2 = Unit.getValue(that);
            return Objects.equals(value1, value2);
        }
        throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.INCOMPATIBLE_TYPES, "Unit is not equal");
    }

    /**
     *
     * @param value
     * @return
     */
    @Override
    public double add(QuantityMeasurement value) throws QuantityMeasurementException {
        if (this.unit.typesOfUnit.equals(value.unit.typesOfUnit)) {
            double firstValue = Unit.getValue(this);
            double secondValue = Unit.getValue(value);
            return firstValue + secondValue;
        }
        throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.INCOMPATIBLE_TYPES, "Unit is not equal");
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        QuantityMeasurement quantityMeasurement = (QuantityMeasurement) that;
        return Double.compare(quantityMeasurement.value, value) == 0 &&
                unit == quantityMeasurement.unit;
    }
}
