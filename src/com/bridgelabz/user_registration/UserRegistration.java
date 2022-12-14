package com.bridgelabz.user_registration;
import java.util.regex.Pattern;
public class UserRegistration {
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}";
    private static final String EMAIL_PATTERN = "^[a-z0-9]+([.+_-]?[a-z0-9]+)?@[a-z0-9]+[.]([a-z0-9]+[.])?[a-z]{2,}";
    private static final String MOBILE_NUMBER_PATTERN = "^[0-9]{1,2} [0-9]{10}";
    private static final String PASSWORD_PATTERN = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}";
    public static boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
    public static boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }
    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
    public static boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        return pattern.matcher(phoneNumber).matches();
    }
    public static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}