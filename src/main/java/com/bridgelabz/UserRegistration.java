package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateFirstName(String name) {

    Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
    Matcher matcher = pattern.matcher(name);
        if (matcher.matches())
            return true;
        else
            return false;
    }
    public boolean validateLastName(String name) {

        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches())
            return true;
        else
            return false;
    }
    public boolean validateEmail(String eMail) {

    Pattern pattern = Pattern.compile("^[a-z0-9]*[.]?[a-z0-9]*(@[a-z]{5}[.][a-z]{3})$");
    Matcher matcher = pattern.matcher(eMail);
        if (matcher.matches())
            return true;
        else
            return false;
    }
    public boolean validateMobileNumber(String mobileNumber) {

        Pattern pattern = Pattern.compile("^(\\+?\\d{1,3}\s\\d{10})$");
        Matcher matcher = pattern.matcher(mobileNumber);
        if (matcher.matches())
            return true;
        else
            return false;
    }
    public boolean validatePassword(String password) {

        Pattern pattern = Pattern.compile("^[a-z]{8,}$");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches())
            return true;
        else
            return false;
    }
}
