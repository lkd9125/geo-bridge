package com.geo.bridge.domain.emitter.integration;

import org.locationtech.jts.geom.Coordinate;
import org.springframework.integration.mqtt.core.DefaultMqttPahoClientFactory;
import org.springframework.integration.mqtt.core.MqttPahoClientFactory;

import lombok.Data;
import reactor.core.publisher.Mono;


/**
 * MQTT 클라이언트 객체
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
public class MqttEmitterClient implements EmitterClient{

    private String name;
    private String host;
    private boolean isConnected = false;
    private String topic;
    private String username;
    private String password;
    private DefaultMqttPahoClientFactory aClientFactory;

    /**
     * MQTT 클라이언트 생성과 동시에 연결
     * @param name
     * @param host
     * @param topic
     * @param username
     * @param password
     */
    public MqttEmitterClient(String name, String host, String topic, String username, String password){
        this.name = name;
        this.host = host;
        this.topic = topic;
        this.username = username;
        this.password = password;

        this.connect();
    }

    @Override
    public void connect() {
    }

    @Override
    public void disconnect() {
    }

    @Override
    public Boolean isConnected() {
        return this.isConnected;
    }

    @Override
    public Mono<Void> send(Coordinate coordinate) {
        return Mono.just(null);
    }

}
