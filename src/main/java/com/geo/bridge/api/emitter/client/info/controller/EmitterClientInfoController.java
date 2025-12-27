package com.geo.bridge.api.emitter.client.info.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geo.bridge.api.emitter.client.info.model.CreateEmitterClientInfoRQ;
import com.geo.bridge.api.emitter.client.info.service.EmitterClientInfoService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

/**
 * DB 저장소에 클라이언트 정보 생성 컨트롤러
 * Validation 처리
 * 
 * <p>기능</p>
 * <ul>
 *     <li>{@link #createEmitterClientInfo(Mono)} 클라이언트 정보 생성</li>
 * </ul>
 */
@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/emitter/client/info")
public class EmitterClientInfoController {

    private final EmitterClientInfoService emitterClientInfoService;

    /**
     * Emitter Client Infomation 생성 (DB)
     * @param rq
     * @return
     */
    @PostMapping
    public Mono<Void> createEmitterClientInfo(@Valid @RequestBody Mono<CreateEmitterClientInfoRQ> rq){
        return emitterClientInfoService.createEmitterClientInfo(rq);
    }

}
