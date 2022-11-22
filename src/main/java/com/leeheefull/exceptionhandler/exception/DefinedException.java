package com.leeheefull.exceptionhandler.exception;

import lombok.Getter;
import org.springframework.validation.Errors;

@Getter
public abstract class DefinedException extends RuntimeException {

    private final int code;
    private final Errors errors;

    /**
     * 예외를 던졌을 경우
     *
     * @param exceptionCode
     */
    public DefinedException(ExceptionCode exceptionCode) {
        this(exceptionCode, null);
    }

    /**
     * try-catch로 잡았을 경우
     *
     * @param exceptionCode
     * @param errors
     */
    public DefinedException(ExceptionCode exceptionCode, Errors errors) {
        super(exceptionCode.getMessage());
        this.code = exceptionCode.getCode();
        this.errors = errors;
    }

}
