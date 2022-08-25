package com.bridgelabz.user_registration;

import static com.bridgelabz.user_registration.UserRegistration.validateFirstName;

public class UserRegistrationMain {
    public static void main(String[] args) {

        String firstName = "Aman";
        System.out.println(validateFirstName(firstName));
    }
}
