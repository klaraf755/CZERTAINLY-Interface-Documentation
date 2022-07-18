package com.czertainly.api.impl;

import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.LocationException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.interfaces.core.web.LocationManagementController;
import com.czertainly.api.model.client.location.AddLocationRequestDto;
import com.czertainly.api.model.client.location.EditLocationRequestDto;
import com.czertainly.api.model.client.location.IssueToLocationRequestDto;
import com.czertainly.api.model.client.location.PushToLocationRequestDto;
import com.czertainly.api.model.common.attribute.AttributeDefinition;
import com.czertainly.api.model.core.location.LocationDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class LocationManagementControllerDummyImpl implements LocationManagementController {

    @Override
    public List<LocationDto> listLocations(Optional<Boolean> enabled) {
        return null;
    }

    @Override
    public ResponseEntity<?> addLocation(AddLocationRequestDto request) throws NotFoundException, AlreadyExistException, LocationException {
        return null;
    }

    @Override
    public LocationDto getLocation(String locationUuid) throws NotFoundException {
        return null;
    }

    @Override
    public LocationDto editLocation(String locationUuid, EditLocationRequestDto request) throws NotFoundException, LocationException {
        return null;
    }

    @Override
    public void removeLocation(String locationUuid) throws NotFoundException {

    }

    @Override
    public void disableLocation(String locationUuid) throws NotFoundException {

    }

    @Override
    public void enableLocation(String locationUuid) throws NotFoundException {

    }

    @Override
    public List<AttributeDefinition> listPushAttributes(String locationUuid) throws NotFoundException, LocationException {
        return null;
    }

    @Override
    public List<AttributeDefinition> listCsrAttributes(String locationUuid) throws NotFoundException, LocationException {
        return null;
    }

    @Override
    public LocationDto pushCertificate(String locationUuid, String certificateUuid, PushToLocationRequestDto request) throws NotFoundException, LocationException {
        return null;
    }

    @Override
    public LocationDto removeCertificate(String locationUuid, String certificateUuid) throws NotFoundException, LocationException {
        return null;
    }

    @Override
    public LocationDto issueCertificate(String locationUuid, IssueToLocationRequestDto request) throws NotFoundException, LocationException {
        return null;
    }

    @Override
    public LocationDto updateLocationContent(String locationUuid) throws NotFoundException, LocationException {
        return null;
    }

    @Override
    public LocationDto renewCertificateInLocation(String locationUuid, String certificateUuid) throws NotFoundException, LocationException {
        return null;
    }
}
