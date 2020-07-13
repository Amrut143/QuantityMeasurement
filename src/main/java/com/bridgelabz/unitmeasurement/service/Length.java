package com.bridgelabz.unitmeasurement.service;

import com.bridgelabz.unitmeasurement.utility.Unit;

public class Length {

    public final Unit unit;
    public final double value;

    /**
     *
     * @param unit
     * @param value
     */
    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     *
     * @param that
     * @return
     */
    public boolean compare(Length that) {
        return Unit.compare(this,that);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }
}
