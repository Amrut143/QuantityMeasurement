package com.bridgelabz.unitmeasurementtest;

import com.bridgelabz.unitmeasurement.service.Length;
import com.bridgelabz.unitmeasurement.utility.Unit;
import org.junit.Assert;
import org.junit.Before;
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
    public void given1FeetAnd2FeetAsNull_ShouldReturnNotEquals() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length feet2 = null;
        boolean isEqual = feet1.equals(feet2);
        Assert.assertEquals(false, isEqual);
    }

    @Test
    public void givenSameReferenceForFeet_ShouldReturnEquals() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        boolean isEqual = feet1.equals(feet1);
        Assert.assertEquals(true, isEqual);
    }

    @Test
    public void givenOneFeetAndOtherClassObject_ShouldReturnNotEqual() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Integer integer = 2;
        boolean isEquals = feet1.equals(integer);
        Assert.assertFalse(isEquals);
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
    public void given1InchAnd2InchAsNull_ShouldReturnNotEquals() {
        Length inch1 = new Length(Unit.INCH, 0.0);
        Length inch2 = null;
        boolean isEqual = inch1.equals(inch2);
        Assert.assertEquals(false, isEqual);
    }

    @Test
    public void givenSameReferenceForInch_ShouldReturnEquals() {
        Length inch1 = new Length(Unit.INCH, 1.0);
        boolean isEqual = inch1.equals(inch1);
        Assert.assertEquals(true, isEqual);
    }

    @Test
    public void givenOneInchAndOtherClassObject_ShouldReturnNotEqual() {
        Length inch1 = new Length(Unit.INCH, 1.0);
        Integer integer = 2;
        boolean isEquals = inch1.equals(integer);
        Assert.assertFalse(isEquals);
    }


    @Test
    public void given0FeetAnd0Inch_WhenCompare_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length inch1 = new Length(Unit.INCH, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertEquals(true, compareCheck);
    }

    @Test
    public void given1InchAnd2Feet_WhenCompare_ShouldReturnFalse() {
        Length inch1 = new Length(Unit.INCH, 1.0);
        Length feet1 = new Length(Unit.FEET, 2.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertEquals(false, compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_WhenCompare_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length inch1 = new Length(Unit.INCH, 12.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertEquals(true, compareCheck);
    }

    @Test
    public void givenThreeFeetAndOneYard_WhenCompare_ShouldReturnTrue() {
        Length feet = new Length(Unit.FEET, 3.0);
        Length yard = new Length(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneFeetAndOneYard_WhenCompare_ShouldReturnFalse() {
        Length feet = new Length(Unit.FEET, 1.0);
        Length yard = new Length(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenOneInchAndOneYard_WhenCompare_ShouldReturnFalse() {
        Length inch = new Length(Unit.INCH, 1.0);
        Length yard = new Length(Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompare_ShouldReturnEqualLength() {
        Length yard = new Length(Unit.YARD, 1.0);
        Length inch = new Length(Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assert.assertTrue(compareCheck);
    }
}
