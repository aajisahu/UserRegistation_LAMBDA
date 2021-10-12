package com.regex.lambda;

@FunctionalInterface
public interface UserValidate<T> {
    boolean validate(T param);
}