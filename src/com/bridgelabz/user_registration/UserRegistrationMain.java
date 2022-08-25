package com.bridgelabz.user_registration;

import static com.bridgelabz.user_registration.UserRegistration.*;

public class UserRegistrationMain {
    public static void main(String[] args) {

        String firstName = "Aman";
        System.out.println(validateFirstName(firstName));

        String lastName = "Khan";
        System.out.println(validateLastName(lastName));

        String email = "aman.khan@gmail.co.in";
        System.out.println(validateEmail(email));
    }
}
