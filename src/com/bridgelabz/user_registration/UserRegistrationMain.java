package com.bridgelabz.user_registration;

import static com.bridgelabz.user_registration.UserRegistration.validateFirstName;
import static com.bridgelabz.user_registration.UserRegistration.validateLastName;

public class UserRegistrationMain {
    public static void main(String[] args) {

        String firstName = "Aman";
        System.out.println(validateFirstName(firstName));

        String lastName = "Khan";
        System.out.println(validateLastName(lastName));
    }
}
