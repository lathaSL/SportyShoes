package com.billingservice.billingservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ReportExceptionController {
   @ExceptionHandler(value = ReportNotFoundException.class)
   public ResponseEntity<Object> exception(ReportNotFoundException exception) {
      return new ResponseEntity<>("Purchase details not found", HttpStatus.NOT_FOUND);
   }
}