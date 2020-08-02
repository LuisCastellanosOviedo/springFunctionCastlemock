package com.demoFunction.functions;

import com.demoFunction.model.RequirementRequest;
import com.demoFunction.model.RequirementResponse;
import com.demoFunction.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class RequirementFunction implements Function<RequirementRequest, RequirementResponse> {


    private final CompanyService companyService;

    @Autowired
    public RequirementFunction(CompanyService companyService) {
        this.companyService = companyService;
    }

    @Override
    public RequirementResponse apply(RequirementRequest requirementRequest) {
        return companyService.createRequirement(requirementRequest);
    }
}
