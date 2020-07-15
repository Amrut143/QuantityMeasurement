package com.bridgelabz.unitmeasurement.service;

import com.bridgelabz.unitmeasurement.utility.Unit;

public class QuantityMeasurement {

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
    public boolean compare(QuantityMeasurement that) {
        return Unit.compare(this,that);
    }

    /**
     *
     * @param value
     * @return
     */
    public double add(QuantityMeasurement value) {
        return Unit.add(this,value);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        QuantityMeasurement length = (QuantityMeasurement) that;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }
}
