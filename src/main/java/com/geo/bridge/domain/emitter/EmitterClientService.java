package com.geo.bridge.domain.emitter;

import org.springframework.stereotype.Service;

import com.geo.bridge.domain.emitter.dto.EmitterClientDTO;
import com.geo.bridge.domain.emitter.repository.EmitterClientRepository;
import com.geo.bridge.global.utils.JsonUtil;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

/**
 * Client 생성
 * <p>기능</p>
 * <ul>
 *     <li>{@link #createClient()} 클라이언트 생성</li>
 * </ul>
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class EmitterClientService {

    private final EmitterClientRepository emitterClientRepository;


    /**
     * DB Client Infomation Save
     * @param mono
     * @return
     */
    public Mono<Void> createClient(Mono<EmitterClientDTO> mono){
        return mono
            .doOnNext(rq -> log.info(JsonUtil.toJson(rq)))
            .flatMap(emitterClientRepository::save)
            .then();
    }
    
}
