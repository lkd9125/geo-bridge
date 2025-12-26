package com.geo.bridge.global.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.support.WebExchangeBindException;

import com.geo.bridge.global.exception.model.BaseExceptionRS;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(exception = WebExchangeBindException.class)
    public Mono<ResponseEntity<BaseExceptionRS>> handleValdationException(){
            
        return null;
    }

}
