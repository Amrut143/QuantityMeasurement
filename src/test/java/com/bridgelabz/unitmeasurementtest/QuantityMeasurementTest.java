package com.bridgelabz.unitmeasurementtest;

import com.bridgelabz.unitmeasurement.exception.QuantityMeasurementException;
import com.bridgelabz.unitmeasurement.service.QuantityMeasurement;
import com.bridgelabz.unitmeasurement.enums.Unit;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {


    @Test
    public void givenSameFeetValue_ShouldReturnEquals() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenDifferentFeetValue_ShouldReturnNotEquals() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET, 1.1);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given1FeetAnd2FeetAsNull_ShouldReturnNotEquals() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement feet2 = null;
        boolean isEqual = feet1.equals(feet2);
        Assert.assertEquals(false, isEqual);
    }

    @Test
    public void givenSameReferenceForFeet_ShouldReturnEquals() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 1.0);
        boolean isEqual = feet1.equals(feet1);
        Assert.assertEquals(true, isEqual);
    }

    @Test
    public void givenOneFeetAndOtherClassObject_ShouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 1.0);
        Integer integer = 2;
        boolean isEquals = feet1.equals(integer);
        Assert.assertFalse(isEquals);
    }

    @Test
    public void givenSameInchValue_ShouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenDifferentInchValue_ShouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1InchAnd2InchAsNull_ShouldReturnNotEquals() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        QuantityMeasurement inch2 = null;
        boolean isEqual = inch1.equals(inch2);
        Assert.assertEquals(false, isEqual);
    }

    @Test
    public void givenSameReferenceForInch_ShouldReturnEquals() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 1.0);
        boolean isEqual = inch1.equals(inch1);
        Assert.assertEquals(true, isEqual);
    }

    @Test
    public void givenOneInchAndOtherClassObject_ShouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 1.0);
        Integer integer = 2;
        boolean isEquals = inch1.equals(integer);
        Assert.assertFalse(isEquals);
    }


    @Test
    public void given0FeetAnd0Inch_WhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertEquals(true, compareCheck);
    }

    @Test
    public void given1InchAnd2Feet_WhenCompare_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 1.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 2.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertEquals(false, compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_WhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 12.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertEquals(true, compareCheck);
    }

    @Test
    public void givenThreeFeetAndOneYard_WhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 3.0);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneFeetAndOneYard_WhenCompare_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenOneInchAndOneYard_WhenCompare_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.0);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchAndOneYard_WhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 36.0);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneYardAndThreeFeet_WhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1.0);
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenSameCentimeterValue_ShouldReturnEqual() {
        QuantityMeasurement centimeter1 = new QuantityMeasurement(Unit.CM, 0.0);
        QuantityMeasurement centimeter2 = new QuantityMeasurement(Unit.CM, 0.0);
        Assert.assertEquals(centimeter1, centimeter2);
    }

    @Test
    public void givenDifferentCentimeterValue_ShouldReturnNotEqual() {
        QuantityMeasurement centimeter1 = new QuantityMeasurement(Unit.CM, 0.0);
        QuantityMeasurement centimeter2 = new QuantityMeasurement(Unit.CM, 1.0);
        Assert.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void given1CentimeterAnd2CentimeterAsNull_ShouldReturnNotEquals() {
        QuantityMeasurement centimeter1 = new QuantityMeasurement(Unit.CM, 0.0);
        QuantityMeasurement centimeter2 = null;
        boolean isEqual = centimeter1.equals(centimeter2);
        Assert.assertEquals(false, isEqual);
    }

    @Test
    public void givenSameReferenceForCentimeter_ShouldReturnEquals() {
        QuantityMeasurement centimeter1 = new QuantityMeasurement(Unit.CM, 1.0);
        boolean isEqual = centimeter1.equals(centimeter1);
        Assert.assertEquals(true, isEqual);
    }

    @Test
    public void givenOneCentimeterAndOtherClassObject_ShouldReturnNotEqual() {
        QuantityMeasurement centimeter = new QuantityMeasurement(Unit.CM, 1.0);
        Integer integer = 2;
        boolean isEquals = centimeter.equals(integer);
        Assert.assertFalse(isEquals);
    }

    @Test
    public void given2InchAnd5Centimeter_WhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 2.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(Unit.CM, 5.0);
        boolean compareCheck = inch.compare(centimeter);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void giveInchAndInch_WhenAdded_ShouldReturnResultInInch() throws QuantityMeasurementException {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 2.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH, 2.0);
        double result = inch1.add(inch2);
        Assert.assertEquals(4, result, 0.0);
    }

    @Test
    public void givenOneFeetAndTwoInches_WhenAdded_ShouldReturnResultInInch() throws QuantityMeasurementException {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 2.0);
        double result = feet.add(inch);
        Assert.assertEquals(14, result, 0.0);
    }

    @Test
    public void givenOneFeetAndOneFeet_WhenAdded_ShouldReturnResultInInch() throws QuantityMeasurementException {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET, 1.0);
        double result = feet1.add(feet2);
        Assert.assertEquals(24, result, 0.0);
    }

    @Test
    public void givenTwoInchAndTwoHalfCm_WhenAdded_ShouldReturnResultInInch() throws QuantityMeasurementException {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 2.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(Unit.CM, 2.5);
        double result = inch.add(centimeter);
        Assert.assertEquals(3, result, 0.0);
    }

    @Test
    public void givenGallonAndLitre_WhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
        QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 3.78);
        boolean compareCheck = gallon.compare(litre);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneLitreAnd1000ml_WhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
        QuantityMeasurement mililitre = new QuantityMeasurement(Unit.ML, 1000.0);
        boolean compareCheck = litre.compare(mililitre);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenGallonAndLitre_WhenAdded_ShouldReturnResultInLitres() throws QuantityMeasurementException {
        QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1.0);
        QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 3.78);
        double result = gallon.add(litre);
        Assert.assertEquals(7.56, result, 0.0);
    }

    @Test
    public void givenOneLitreAnd1000Mililitre_WhenAdded_ShouldReturnResultInLitres() throws QuantityMeasurementException {
        QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1.0);
        QuantityMeasurement mililitre = new QuantityMeasurement(Unit.ML, 1000.0);
        double result = litre.add(mililitre);
        Assert.assertEquals(2.0, result, 0.0);
    }

    @Test
    public void givenOneKgAnd1000Gm_WhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1.0);
        QuantityMeasurement gram = new QuantityMeasurement(Unit.GRAM, 1000.0);
        boolean compareCheck = kg.compare(gram);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneTonneAnd1000Kgs_WhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
        QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1000.0);
        boolean compareCheck = tonne.compare(kg);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneTonneAnd1000Grams_WhenAdded_ShouldReturnResultInKgs() throws QuantityMeasurementException {
        QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
        QuantityMeasurement gram = new QuantityMeasurement(Unit.GRAM, 1000.0);
        double result = tonne.add(gram);
        Assert.assertEquals(1001.0, result, 0.0);
    }

    @Test
    public void givenOneTonneAnd100Kgs_WhenCompare_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1.0);
        QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 100.0);
        boolean compareCheck = tonne.compare(kg);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given100degCelAnd212Fahrenheit_WhenCompare_ShouldReturnTrue() throws QuantityMeasurementException {
            QuantityMeasurement celsius = new QuantityMeasurement(Unit.CELSIUS, 100.0);
            QuantityMeasurement fahrenheit = new QuantityMeasurement(Unit.FAHRENHEIT, 212.0);
            boolean compareCheck = celsius.compare(fahrenheit);
            Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenFeetAndGallon_WhenNotEqual_ShouldThrowCustomException() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1.0);
        QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 3.78);
        boolean compareCheck = false;
        try {
            compareCheck = feet.compare(gallon);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.INCOMPATIBLE_TYPES, e.type);
            e.printStackTrace();
        }
        Assert.assertFalse(compareCheck);
    }

}
