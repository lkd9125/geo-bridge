package com.geo.bridge.global.base;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 페이징 RQ
 * 
 * <p>변수</p>
 * <ul>
 *     <li>{@link #page} : 페이지</li>
 *     <li>{@link #size} : 페이지에 보일 사이즈</li>
 *     <li>{@link #range} : 범위</li>
 * </ul>
 * 
 * <p>메소드</p>
 * <ul>
 *     <li>{@link #getOffset()} : DB Limit용 offset</li>
 * </ul>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BasePageRQ {

    @Min(1)
    @Builder.Default
    private int page = 1;
    @Builder.Default
    private int size = 10;
    @Builder.Default
    private int range = 10;

    public int getOffset() {
        if(page <= 1) return 0;
        return (page - 1) * size;
    }

}
