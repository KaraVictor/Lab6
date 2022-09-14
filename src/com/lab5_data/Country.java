package com.lab5_data;

public enum Country {

    UNITED_KINGDOM,
    CHINA,
    ITALY,
    THAILAND;

    public static boolean containsCountry(String test) {
        for (Country rating : Country.values()) {
            if (rating.name().equals(test)) {
                return true;
            }
        }
        return false;
    }
}
