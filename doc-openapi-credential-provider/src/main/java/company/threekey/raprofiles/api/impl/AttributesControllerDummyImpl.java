package company.threekey.raprofiles.api.impl;

import company.threekey.raprofiles.api.exception.ValidationException;
import company.threekey.raprofiles.api.interfaces.AttributesController;
import company.threekey.raprofiles.api.model.AttributeDefinition;
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
