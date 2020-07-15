package com.bridgelabz.unitmeasurement.service;

public interface IQuantityMeasurement {

    boolean compare(QuantityMeasurement quantityObj1);
    double add(QuantityMeasurement quantityObj1);
}
