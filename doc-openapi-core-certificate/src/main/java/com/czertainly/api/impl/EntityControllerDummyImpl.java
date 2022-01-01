package com.czertainly.api.impl;

import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.interfaces.core.web.EntityController;
import com.czertainly.api.model.core.certificate.entity.EntityDto;
import com.czertainly.api.model.core.certificate.entity.EntityRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EntityControllerDummyImpl implements EntityController {

    @Override
    public List<EntityDto> listEntities() {
        return null;
    }

    @Override
    public EntityDto getEntity(String uuid) throws NotFoundException {
        return null;
    }

    @Override
    public ResponseEntity<?> createEntity(EntityRequestDto request) throws AlreadyExistException, NotFoundException {
        return null;
    }

    @Override
    public EntityDto updateEntity(String uuid, EntityRequestDto request) throws NotFoundException {
        return null;
    }

    @Override
    public void removeEntity(String uuid) throws NotFoundException {

    }

    @Override
    public void bulkRemoveEntity(List<String> entityUuids) throws NotFoundException {

    }

}
