package com.demoFunction.service;

import com.demoFunction.model.RequirementRequest;
import com.demoFunction.model.RequirementResponse;

import java.util.Optional;

public interface CompanyService {

    RequirementResponse createRequirement(RequirementRequest requirementRequest);

    Optional<String> findRequirementByName(RequirementRequest requirementRequest);
}
