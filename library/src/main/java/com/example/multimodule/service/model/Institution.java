package com.example.multimodule.service.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Institution implements Serializable {

    private static final long serialVersionUID = 1L;

    private String institutionType;

    private String institutionCode;

    private String institutionName;

    private String institutionShortName;

    private String countryCode;

    private String welcomeMessage;

}
