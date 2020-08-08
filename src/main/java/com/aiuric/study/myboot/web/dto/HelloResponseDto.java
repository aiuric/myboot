package com.aiuric.study.myboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor // 선언됨 모든 final field가 포함된 생성자를 생성
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
