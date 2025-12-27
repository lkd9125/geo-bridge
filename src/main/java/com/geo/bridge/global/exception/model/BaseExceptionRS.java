package com.geo.bridge.global.exception.model;

import lombok.Data;

@Data
public class BaseExceptionRS {

    private String message;

    private String description;

    private String code;

}
