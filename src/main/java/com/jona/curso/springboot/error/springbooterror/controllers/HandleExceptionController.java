package com.jona.curso.springboot.error.springbooterror.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jona.curso.springboot.error.springbooterror.models.Error;

@RestControllerAdvice
public class HandleExceptionController {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<?> divisionByZero(Exception ex) {
        return ResponseEntity.internalServerError().body("error 500");
    }
}
