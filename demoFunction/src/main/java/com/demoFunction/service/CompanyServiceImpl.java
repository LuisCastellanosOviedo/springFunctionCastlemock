package com.demoFunction.service;

import com.demoFunction.model.RequirementRequest;
import com.demoFunction.model.RequirementResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

@Service
public class CompanyServiceImpl implements CompanyService{


    @Override
    public RequirementResponse createRequirement(RequirementRequest requirementRequest) {
        final String requirementId = generateId();
        final String rqName = getRequirementId(requirementRequest.getName());


        return RequirementResponse.builder()
                .id(requirementId)
                .name(rqName)
                .date(LocalDate.now())
                .build();

    }

    private String getRequirementId(final String requirementName) {
        return requirementName.toUpperCase();
    }

    private String generateId() {
        return UUID.randomUUID().toString();
    }
}
