package com.hilgenberg.lispvalidator.service;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class ValidatorService {
    /*Service to do validation of LISP Strings*/

    public boolean validateLISPString(String inputToValidate) {
        int opening = 0;
        int closing = 0;
        if (inputToValidate != null && inputToValidate.length() > 0) {
            opening = StringUtils.countOccurrencesOf(inputToValidate, "(");
            closing = StringUtils.countOccurrencesOf(inputToValidate, ")");
            // if the opening and closing tags match, all parenthesis are closed properly
            // we also want to watch for non-LISP strings, so we need to return false if the total
            // of both opening and closing parenthesis is 0
            return (opening != 0 && closing != 0) && opening == closing;
        }
        return false;
    }
}
