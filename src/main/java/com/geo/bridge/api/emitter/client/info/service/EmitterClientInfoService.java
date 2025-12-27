package com.geo.bridge.api.emitter.client.info.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geo.bridge.api.emitter.client.info.model.CreateEmitterClientInfoRQ;
import com.geo.bridge.domain.emitter.EmitterClientService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

/**
 * DB 저장소에 클라이언트 정보 생성 서비스 로직
 * Domain 접근
 * 
 * <p>기능</p>
 * <ul>
 *     <li>{@link #createEmitterClientInfo(Mono)} 클라이언트 정보 생성</li>
 * </ul>
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class EmitterClientInfoService {

    private final EmitterClientService emitterClientService;

    /**
     * 1. Emitter Client Infomation DTO 변환
     * 2. DB Save 호출
     * @param mono Web RQ Model
     * @return
     */
    @Transactional
    public Mono<Void> createEmitterClientInfo(Mono<CreateEmitterClientInfoRQ> mono){
        return mono
            .map(CreateEmitterClientInfoRQ::toDto)
            .flatMap(dto -> emitterClientService.createClient(Mono.just(dto)))
            .then();
    }

}
