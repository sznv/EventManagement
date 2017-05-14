package com.tr.common.event.exception;


import com.sun.javaws.exceptions.InvalidArgumentException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidArgumentException.class)
    @ResponseBody
    public ResponseEntity handleInvalidArgumentException(InvalidArgumentException e) {
        return new ResponseEntity(e, HttpStatus.BAD_REQUEST);
    }

    //TODO and so on
}
