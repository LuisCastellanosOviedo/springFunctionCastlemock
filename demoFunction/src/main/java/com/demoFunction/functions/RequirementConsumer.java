package com.demoFunction.functions;

import com.demoFunction.model.RequirementRequest;
import com.demoFunction.service.CompanyService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component(value = "consumer")
@AllArgsConstructor
@Slf4j
public class RequirementConsumer implements Consumer<RequirementRequest> {

    private CompanyService companyService;

    @Override
    public void accept(RequirementRequest requirementRequest) {
        log.info("Company Requirement info {}",
                companyService.findRequirementByName(requirementRequest).get())  ;
    }
}
