package com.hilgenberg.lispvalidator.controller;

import com.hilgenberg.lispvalidator.service.ValidatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ValidatorController {

    @Autowired
    private ValidatorService validatorService;

    @GetMapping(path="/validation/lisp")
    public ResponseEntity<Boolean> validateLISP(@RequestBody String lispStringForInput) {
        return new ResponseEntity<>(validatorService.validateLISPString(lispStringForInput), HttpStatus.OK);
    }
}
