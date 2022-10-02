package com.hilgenberg.lispvalidator.service;

import org.springframework.stereotype.Component;

@Component
public class ValidatorService {
    /*Service to do validation of LISP Strings
    * First Method, will parse string, count opening and closing parenthesis
    * Second Method, will attempt to use regex to do the same thing, with hopefully less logic/lines of code*/

    public boolean validateManually(String inputToValidate) {
        return false;
    }

    public boolean validateUsingRegex(String inputToValidate) {
        return false;
    }
}
