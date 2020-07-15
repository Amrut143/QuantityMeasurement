package com.bridgelabz.unitmeasurement.exception;

public class QuantityMeasurementException extends Exception {

    public enum ExceptionType {
        INCOMPATIBLE_TYPES;
    }
    public ExceptionType type;

    public QuantityMeasurementException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
