package com.geo.bridge.domain.emitter;

import java.util.List;

import org.locationtech.jts.geom.Coordinate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 위치 데이터 계산 서비스
 * <p>기능</p>
 * <ul>
 *     <li>{@link #createSimulatorCoordinates(List, Double, int)} 위치 데이터 발생</li>
 * </ul>
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class EmitterSimulatorService {

    /**
     * coordinates와 속도에 해당되는 좌표 리스트 생성
     * @param coordinates 유저가 선택한 좌표 리스트
     * @param speed 속도
     * @return
     */
    public List<Coordinate> createSimulatorCoordinates(List<Coordinate> coordinates, Double speed, int cycle){

        

        return null;
    }


}
