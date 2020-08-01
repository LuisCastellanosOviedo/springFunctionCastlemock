package com.demoFunction.functions;

import com.demoFunction.model.RequirementRequest;
import com.demoFunction.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component(value = "supp")
@AllArgsConstructor
public class RequirementSupplier implements Supplier<String> {

    private CompanyService companyService;

    @Override
    public String get() {
        RequirementRequest requirementRequest = new RequirementRequest();
        requirementRequest.setName("tets rq");
        return companyService.findRequirementByName(requirementRequest).get();
    }
}
