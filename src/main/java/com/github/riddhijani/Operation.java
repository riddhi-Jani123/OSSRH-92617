package com.github.riddhijani;

import java.math.*;
import java.util.logging.*;

public class Operation {

    public static BigDecimal add(BigDecimal x, BigDecimal y) {
        LOGGER.log(Level.INFO, "Added Successfully");
        return x.add(y);
    }
    public static BigDecimal subtract(BigDecimal x, BigDecimal y) {
        LOGGER.log(Level.INFO, "subtracted Successfully");
        return x.subtract(y);
    }

    public static BigDecimal multiply(BigDecimal x, BigDecimal y) {
        LOGGER.log(Level.INFO, "multiplied Successfully");
        return x.multiply(y);
    }
    public static BigDecimal divide(BigDecimal x, BigDecimal y) {
        LOGGER.log(Level.INFO, "divided Successfully");
        return x.divide(y);
    }

    private final static Logger LOGGER =
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
}