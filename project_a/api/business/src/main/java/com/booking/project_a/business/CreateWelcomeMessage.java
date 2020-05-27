package com.booking.project_a.business;

import com.booking.project_a.common.Utils;
import java.util.function.Function;

public class CreateWelcomeMessage implements Function<String[], String> {

    @Override
    public String apply(String[] strings) {
        return Utils.joinString(strings);
    }
}
