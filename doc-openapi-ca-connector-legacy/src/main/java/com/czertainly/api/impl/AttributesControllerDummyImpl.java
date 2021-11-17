package com.czertainly.api.impl;

import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.interfaces.AttributesController;
import com.czertainly.api.model.AttributeDefinition;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AttributesControllerDummyImpl implements AttributesController {

    @Override
    public List<AttributeDefinition> listAttributeDefinitions(String kind) {
        return null;
    }

    @Override
    public boolean validateAttributes(String kind, List<AttributeDefinition> list) throws ValidationException {
        return false;
    }

}
