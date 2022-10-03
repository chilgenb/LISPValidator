LISPValidator

Created by: Chris Hilgenberg

Email: chris.g.hilgenberg@gmail.com

------------------------------
Premise: 

The application should take an input string that is a program from the LISP programming
language and return true if all opening and closing parenthesis match (e.g. are closed correctly)

This was written as a basic Spring Boot application, with a single endpoint that
can be accessed when running locally at localhost:8080/validation/lisp. 

Accepted input in body is raw text. I personally used Postman to test

Some very rudimentary test cases are added as well.