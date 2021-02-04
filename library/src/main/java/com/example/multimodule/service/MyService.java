package com.example.multimodule.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.multimodule.service.model.Institution;

@Service
public class MyService {

    @Value("${message.hello}")
    private String MESSAGE_HELLO;

    public Institution message() {

        return Institution.builder()
                     .institutionCode("INS_CODE")
                     .institutionName("University of Malaga")
                     .institutionType("UNIVERSITY")
                     .welcomeMessage(MESSAGE_HELLO)
                     .build();
    }
}
