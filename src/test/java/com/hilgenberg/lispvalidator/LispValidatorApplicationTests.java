package com.hilgenberg.lispvalidator;

import com.hilgenberg.lispvalidator.service.ValidatorService;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class LispValidatorApplicationTests extends TestCase {

    @Autowired
    protected ValidatorService service;

    @Test
    void contextLoads() {
    }

    @Test
    void shouldReturnFalseIfNoParenthesisFound() {
        String notLispString = "thisIsNotLISPString";
        assertFalse(service.validateLISPString(notLispString));
    }

    @Test
    void shouldReturnFalseIfMismatchedTotalOfParenthesisFound() {
        //Example string taken from https://www2.cs.sfu.ca/CourseCentral/310/pwfong/Lisp/1/tutorial1.html
        String malformedLispString = "(defun factorial (N)\n" +
                "  \"Compute the factorial of N.\"\n" +
                "  (if (= N 1)\n" +
                "      1\n" +
                "    (* N (factorial (- N 1))))";
        assertFalse(service.validateLISPString(malformedLispString));
    }

    @Test
    void shouldReturnTrueIfOpeningAndClosingParenthesisMatch() {
        //Example string taken from https://www2.cs.sfu.ca/CourseCentral/310/pwfong/Lisp/1/tutorial1.html
        String lispString = "(defun fibonacci (N)\n" +
                "  \"Compute the N'th Fibonacci number.\"\n" +
                "  (if (or (zerop N) (= N 1))\n" +
                "      1\n" +
                "    (+ (fibonacci (- N 1)) (fibonacci (- N 2)))))";
        assertTrue(service.validateLISPString(lispString));
    }
}
