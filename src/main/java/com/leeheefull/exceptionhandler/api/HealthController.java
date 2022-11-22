package com.leeheefull.exceptionhandler.api;

import com.leeheefull.exceptionhandler.exception.ExceptionCode;
import com.leeheefull.exceptionhandler.exception.custom.CustomException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public void healthBad() {
        throw new CustomException(ExceptionCode.CUSTOM_EXCEPTION);
    }

}
