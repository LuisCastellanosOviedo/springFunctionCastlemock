package com.demoFunction.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class RequirementResponse {

    private String id;
    private String name;
    private LocalDate date;
}
