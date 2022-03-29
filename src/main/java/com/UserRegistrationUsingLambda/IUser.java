package com.UserRegistrationUsingLambda;

@FunctionalInterface
public interface IUser {
boolean validation(String input, String regex);
}
