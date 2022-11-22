package com.leeheefull.exceptionhandler.exception.custom;

import com.leeheefull.exceptionhandler.exception.DefinedException;
import com.leeheefull.exceptionhandler.exception.ExceptionCode;
import lombok.Getter;

@Getter
public class CustomException extends DefinedException {

    public CustomException(ExceptionCode exceptionCode) {
        super(exceptionCode);
    }

}
