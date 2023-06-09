package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    void givenFirstNameHappyTest() {
        boolean actualFirstName = userRegistration.validateFirstName("Drisya");
        Assertions.assertTrue(actualFirstName);
        System.out.println("FirstName Successfully Validate.");
    }

    @Test
    void givenFirstNameSadTest() {
        boolean actualFirstName = userRegistration.validateFirstName("Drisya.k");
        Assertions.assertFalse(actualFirstName);
        System.out.println("FirstName Invalid.");
    }

    @Test
    void givenLastNameHappyTest() {
        boolean actualLastName = userRegistration.validateLastName("Athul");
        Assertions.assertTrue(actualLastName);
        System.out.println("LastName Successfully Validate.");
    }

    @Test
    void givenLastNameSadTest() {
        boolean actualLastName = userRegistration.validateLastName("athul");
        Assertions.assertFalse(actualLastName);
        System.out.println("LastName Invalid.");
    }

    @Test
    void givenEmailHappyTest() {
        boolean actualEmail = userRegistration.validateEmail("drisya.athul8@gmail.com");
        Assertions.assertTrue(actualEmail);
        System.out.println("Email Successfully Validate.");
    }

    @Test
    void givenEmailSadTest() {
        boolean actualEmail = userRegistration.validateEmail("Dirsya.Athul8@gmailcom");
        Assertions.assertFalse(actualEmail);
        System.out.println("Email Invalid.");
    }

    @Test
    void givenMobileNumberHappyTest() {
        boolean actualMobileNumber = userRegistration.validateMobileNumber("+91 9486584620");
        Assertions.assertTrue(actualMobileNumber);
        System.out.println("Mobile Number Successfully Validate.");
    }

    @Test
    void givenMobileNumberSadTest() {
        boolean actualMobileNumber = userRegistration.validateMobileNumber("+919486584620");
        Assertions.assertFalse(actualMobileNumber);
        System.out.println("Mobile Number Invalid.");
    }

    @Test
    void givenPasswordHappyTest() {
        boolean actualPassword = userRegistration.validatePassword("myPass_Word@123");
        Assertions.assertTrue(actualPassword);
        System.out.println("Password Successfully Validate.");
    }

    @Test
    void givenPasswordSadTest() {
        boolean actualPassword = userRegistration.validatePassword("my_password");
        Assertions.assertFalse(actualPassword);
        System.out.println("Password Invalid.");
    }
}

