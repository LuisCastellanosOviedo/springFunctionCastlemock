package com.demoFunction.service;

import com.demoFunction.model.RequirementRequest;
import com.demoFunction.model.RequirementResponse;

public interface CompanyService {

    RequirementResponse createRequirement(RequirementRequest requirementRequest);
}
