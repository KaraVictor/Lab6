package com.lab5_data;

public enum MpaaRating {

    G,
    PG,
    PG_13,
    R;

    public static boolean contains(String test) {
        for (MpaaRating rating : MpaaRating.values()) {
            if (rating.name().equals(test)) {
                return true;
            }
        }
        return false;
    }
}