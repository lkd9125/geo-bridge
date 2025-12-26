package com.geo.bridge.domain.emitter.dto;

import lombok.Data;

/**
 * MQTT 클라이언트 API 계층 통신 객체
 * <p>변수</p>
 * <ul>
 *     <li>{@link #name} : 클라이어트 식별 이름</li>
 *     <li>{@link #host} : 연결 호스트</li>
 *     <li>{@link #isConnected} : 연결 여부</li>
*      <li>{@link #topic} : MQTT 토픽</li>
*      <li>{@link #username} : 아이디</li>
*      <li>{@link #password} : 비밀번호</li>
 * </ul>
 */
@Data
public class EmitterClientDTO {
    private String host;

    private String type;
}
