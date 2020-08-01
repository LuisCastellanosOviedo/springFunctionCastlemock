package com.demoFunction;

import com.demoFunction.model.RequirementRequest;
import com.demoFunction.model.RequirementResponse;
import com.demoFunction.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
@AllArgsConstructor
public class RequirementFunction implements Function<RequirementRequest, RequirementResponse> {

    private CompanyService companyService;

    @Override
    public RequirementResponse apply(RequirementRequest requirementRequest) {
        return companyService.createRequirement(requirementRequest);
    }
}
