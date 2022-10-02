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

    @GetMapping(path="/validate")
    public ResponseEntity<Boolean> validateIncomingLISPString(@RequestParam String lispStringForInput) {
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

}
