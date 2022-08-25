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

        String phoneNumber = "91 1234567890";
        System.out.println(validatePhoneNumber(phoneNumber));

        String password = "khanAman1";
        System.out.println(validatePassword(password));
    }
}
