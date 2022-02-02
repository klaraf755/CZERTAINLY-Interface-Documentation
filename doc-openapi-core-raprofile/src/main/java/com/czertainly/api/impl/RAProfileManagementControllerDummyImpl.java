package com.czertainly.api.impl;

import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.ConnectorException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.interfaces.core.web.RAProfileManagementController;
import com.czertainly.api.model.client.client.SimplifiedClientDto;
import com.czertainly.api.model.client.raprofile.ActivateAcmeForRaProfileRequestDto;
import com.czertainly.api.model.client.raprofile.AddRaProfileRequestDto;
import com.czertainly.api.model.client.raprofile.EditRaProfileRequestDto;
import com.czertainly.api.model.client.raprofile.RaProfileAcmeDetailResponseDto;
import com.czertainly.api.model.common.AttributeDefinition;
import com.czertainly.api.model.core.raprofile.RaProfileDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RAProfileManagementControllerDummyImpl implements RAProfileManagementController {

    @Override
    public List<RaProfileDto> listRaProfiles() {
        return null;
    }

    @Override
    public List<RaProfileDto> listRaProfiles(Boolean isEnabled) {
        return null;
    }

    @Override
    public ResponseEntity<?> addRaProfile(AddRaProfileRequestDto request) throws AlreadyExistException, ValidationException, NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public RaProfileDto getRaProfile(String uuid) throws NotFoundException {
        return null;
    }

    @Override
    public RaProfileDto editRaProfile(String uuid, EditRaProfileRequestDto request) throws NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public void removeRaProfile(String uuid) throws NotFoundException {

    }

    @Override
    public void disableRaProfile(String uuid) throws NotFoundException {

    }

    @Override
    public void enableRaProfile(String uuid) throws NotFoundException {

    }

    @Override
    public List<SimplifiedClientDto> listClients(String uuid) throws NotFoundException {
        return null;
    }

    @Override
    public void bulkRemoveRaProfile(List<String> uuids) throws NotFoundException, ValidationException {

    }

    @Override
    public void bulkDisableRaProfile(List<String> uuids) throws NotFoundException {

    }

    @Override
    public void bulkEnableRaProfile(List<String> uuids) throws NotFoundException {

    }

    @Override
    public RaProfileAcmeDetailResponseDto getAcmeForRaProfile(String uuid) throws NotFoundException {
        return null;
    }

    @Override
    public RaProfileAcmeDetailResponseDto activateAcmeForRaProfile(String uuid, ActivateAcmeForRaProfileRequestDto request) throws ConnectorException {
        return null;
    }

    @Override
    public void deactivateAcmeForRaProfile(String uuid) throws NotFoundException {

    }

    @Override
    public List<AttributeDefinition> listRevokeCertificateAttributes(String uuid) throws NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public List<AttributeDefinition> listIssueCertificateAttributes(String uuid) throws NotFoundException, ConnectorException {
        return null;
    }

}
