package com.bridgelabz.unitmeasurement.service;

import com.bridgelabz.unitmeasurement.exception.QuantityMeasurementException;

public interface IQuantityMeasurement {

    boolean compare(QuantityMeasurement quantityObj1) throws QuantityMeasurementException;
    double add(QuantityMeasurement quantityObj1) throws QuantityMeasurementException;
}
