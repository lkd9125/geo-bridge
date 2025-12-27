package com.geo.bridge.domain.emitter.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import com.geo.bridge.domain.emitter.dto.EmitterClientDTO;

/**
 * EmitterClient 테이블 DB 조작 Repopsitory
 * 
 * <ul>
 * </ul>
 */
public interface EmitterClientRepository extends R2dbcRepository<EmitterClientDTO, Long>, EmitterClientBaseRepository{



}
