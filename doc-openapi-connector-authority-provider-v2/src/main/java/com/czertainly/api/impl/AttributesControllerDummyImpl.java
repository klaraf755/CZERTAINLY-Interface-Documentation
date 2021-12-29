package com.czertainly.api.impl;

import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.interfaces.connector.AttributesController;
import com.czertainly.api.model.common.AttributeDefinition;
import com.czertainly.api.model.common.RequestAttributeDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AttributesControllerDummyImpl implements AttributesController {

    @Override
    public List<AttributeDefinition> listAttributeDefinitions(String kind) {
        return null;
    }

    @Override
    public boolean validateAttributes(String kind, List<RequestAttributeDto> attributes) throws ValidationException {
        return false;
    }

}
