package com.demoFunction.aws;

import com.demoFunction.model.RequirementRequest;
import com.demoFunction.model.RequirementResponse;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class CompanyFucntionAWSHandler extends SpringBootRequestHandler<RequirementRequest, RequirementResponse> {


}
