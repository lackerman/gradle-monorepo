package com.booking.project_a.service;

import com.booking.project_a.business.CreateWelcomeMessage;
import com.booking.project_a.common.Utils;

public class Application {
    public static void main(String[] args) {
        CreateWelcomeMessage messageCreator = new CreateWelcomeMessage();
        System.out.println(Utils.uppercase(messageCreator.apply(args)));
    }
}
