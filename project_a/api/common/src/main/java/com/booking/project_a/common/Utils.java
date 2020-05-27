package com.booking.project_a.common;

public class Utils {
    public static String uppercase(String string) {
        return string.toUpperCase();
    }

    public static String joinString(String... strings) {
        return String.join("_", strings);
    }
}
