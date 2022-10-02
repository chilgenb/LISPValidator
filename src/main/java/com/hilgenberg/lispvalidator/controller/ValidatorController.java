package com.hilgenberg.lispvalidator.controller;

import com.hilgenberg.lispvalidator.service.ValidatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidatorController {

    @Autowired
    private ValidatorService validatorService;

    @GetMapping(path="/validate/manually")
    public ResponseEntity<Boolean> validateLISPStringManually(@RequestParam String lispStringForInput) {
        return new ResponseEntity<>(validatorService.validateManually(lispStringForInput), HttpStatus.OK);
    }

    @GetMapping(path="/validate/regex")
    public ResponseEntity<Boolean> validateLISPStringUsingRegex(@RequestParam String listStringForInput) {
        return new ResponseEntity<>(validatorService.validateUsingRegex(listStringForInput), HttpStatus.OK);
    }
}
