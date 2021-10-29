package com.czertainly.api.impl;

import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.interfaces.CAInstanceController;
import com.czertainly.api.model.AttributeDefinition;
import com.czertainly.api.model.ca.CAInstanceDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CAInstanceControllerDummyImpl implements CAInstanceController {

    @Override
    public List<CAInstanceDto> listCAInstances() {
        return null;
    }

    @Override
    public CAInstanceDto getCAInstance(Long aLong) throws NotFoundException {
        return null;
    }

    @Override
    public CAInstanceDto createCAInstance(CAInstanceDto caInstanceDto) throws AlreadyExistException {
        return null;
    }

    @Override
    public CAInstanceDto updateCAInstance(Long aLong, CAInstanceDto caInstanceDto) throws NotFoundException {
        return null;
    }

    @Override
    public void removeCAInstance(Long aLong) throws NotFoundException {

    }

    @Override
    public void getConnection(Long aLong) throws NotFoundException {

    }

    @Override
    public List<AttributeDefinition> listRAProfileAttributes(Long authorityId) throws NotFoundException {
        return null;
    }

    @Override
    public boolean validateRAProfileAttributes(Long authorityId, List<AttributeDefinition> attributes) throws ValidationException, NotFoundException {
        return false;
    }

}
