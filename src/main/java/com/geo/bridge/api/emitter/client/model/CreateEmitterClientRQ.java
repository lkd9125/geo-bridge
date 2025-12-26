package com.geo.bridge.api.emitter.client.model;

import com.geo.bridge.domain.emitter.integration.model.EmitterType;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateEmitterClientRQ {

    @NotNull
    private EmitterType clientType;

    @NotNull
    private String host;

    @NotNull
    private String name;

    private String topic;

}
