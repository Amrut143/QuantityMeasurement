package com.bridgelabz.unitmeasurementtest;

import com.bridgelabz.unitmeasurement.service.Length;
import com.bridgelabz.unitmeasurement.utility.Unit;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenSameFeetValue_ShouldReturnEquals() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length feet2 = new Length(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenDifferentFeetValue_ShouldReturnNotEquals() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length feet2 = new Length(Unit.FEET, 1.1);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenSameInchValue_ShouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH, 0.0);
        Length inch2 = new Length(Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenDifferentInchValue_ShouldReturnNotEqual() {
        Length inch1 = new Length(Unit.INCH, 0.0);
        Length inch2 = new Length(Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length inch1 = new Length(Unit.INCH, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertEquals(true, compareCheck);
    }

    @Test
    public void given1InchAnd2Feet_ShouldReturnFalse() {
        Length inch1 = new Length(Unit.INCH, 1.0);
        Length feet1 = new Length(Unit.FEET, 2.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertEquals(false, compareCheck);
    }
}
