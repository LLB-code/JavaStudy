package com.example.javastudy.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,Object> handleValidException(MethodArgumentNotValidException e){
        Map<String,Object> result = new HashMap<>();
        result.put("code",400);
        String message = e.getBindingResult().getFieldError().getDefaultMessage();
        result.put("message",message);
        return result;
    }

}
