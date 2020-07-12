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
}
