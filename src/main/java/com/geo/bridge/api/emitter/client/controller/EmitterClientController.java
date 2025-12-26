package com.geo.bridge.api.emitter.client.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geo.bridge.api.emitter.client.model.CreateEmitterClientRQ;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/emitter/client")
public class EmitterClientController {

    /**
     * Emitter Client 생성 (DB)
     * @param rq
     * @return
     */
    @PostMapping
    public Mono<Void> createEmitterClient(@Valid Mono<CreateEmitterClientRQ> rq){
        return rq
        .flatMap(rqModel -> {
            return null;
        })
        .onErrorResume(e -> {
            return null;
        })
        .then();
    }

}
