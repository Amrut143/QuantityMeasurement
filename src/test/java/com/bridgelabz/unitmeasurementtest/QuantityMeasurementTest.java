package com.bridgelabz.unitmeasurementtest;

import com.bridgelabz.unitmeasurement.service.Length;
import com.bridgelabz.unitmeasurement.utility.Unit;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenFeetValue_ShouldReturnEquals() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length feet2 = new Length(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }
}
