package com.bridgelabz.unitmeasurement.service;

import com.bridgelabz.unitmeasurement.exception.QuantityMeasurementException;

public interface IQuantityMeasurement {

    boolean compare(QuantityMeasurement quantityObj) throws QuantityMeasurementException;
    double add(QuantityMeasurement quantityObj) throws QuantityMeasurementException;
}
