package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailTest {

    private String emailId;
    private boolean expectedResult;
    private UserRegistration userRegistration;

    public EmailTest(String emailId, boolean expectedResult){

        this.emailId = emailId;
        this.expectedResult = expectedResult;

    }
    @Before
    public void init(){
        userRegistration = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input() {

        return Arrays.asList(new Object[][]{{"abc@yahoo.com",true},{"abc.100@yahoo.com",true},{"abc@yahoo",false},{"abc_123@gmail.com",false}});

    }

    @Test
    public void givenEmailHappyTest() {
        boolean actualEmail = userRegistration.validateEmail(emailId);
        Assert.assertEquals(expectedResult,actualEmail);
        System.out.println("Email Successfully Validate.");
    }
}
