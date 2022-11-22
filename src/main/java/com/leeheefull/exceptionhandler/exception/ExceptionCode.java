package com.leeheefull.exceptionhandler.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
@Getter
public enum ExceptionCode {

    DEFAULT_EXCEPTION(10000, "예외가 발생했습니다."),
    DEFINED_EXCEPTION(20000, "정의된 예외가 발생했습니다."),
    CUSTOM_EXCEPTION(30000, "커스텀 예외가 발생했습니다."),
    ;

    private final int code;
    private final String message;

    public static ExceptionCode of(int code) {
        return Arrays.stream(ExceptionCode.values())
                .filter(errorCodes -> errorCodes.getCode() == code)
                .findAny()
                .orElse(DEFAULT_EXCEPTION);
    }

}