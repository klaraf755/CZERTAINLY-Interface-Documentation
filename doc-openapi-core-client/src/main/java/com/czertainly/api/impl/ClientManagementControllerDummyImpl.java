package com.czertainly.api.impl;

import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.interfaces.core.web.ClientManagementController;
import com.czertainly.api.model.client.client.AddClientRequestDto;
import com.czertainly.api.model.client.client.EditClientRequestDto;
import com.czertainly.api.model.core.client.ClientDto;
import com.czertainly.api.model.core.raprofile.RaProfileDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.security.cert.CertificateException;
import java.util.List;

@RestController
public class ClientManagementControllerDummyImpl implements ClientManagementController {

    @Override
    public List<ClientDto> listClients() {
        return null;
    }

    @Override
    public ResponseEntity<?> addClient(AddClientRequestDto request) throws CertificateException, AlreadyExistException, NotFoundException, ValidationException {
        return null;
    }

    @Override
    public ClientDto getClient(String uuid) throws NotFoundException {
        return null;
    }

    @Override
    public ClientDto editClient(String uuid, EditClientRequestDto request) throws CertificateException, NotFoundException, AlreadyExistException {
        return null;
    }

    @Override
    public void removeClient(String uuid) throws NotFoundException {

    }

    @Override
    public void bulkRemoveClient(List<String> clientUuids) throws NotFoundException {

    }

    @Override
    public List<RaProfileDto> listAuthorizations(String uuid) throws NotFoundException {
        return null;
    }

    @Override
    public void disableClient(String uuid) throws NotFoundException {

    }

    @Override
    public void enableClient(String uuid) throws NotFoundException, CertificateException {

    }

    @Override
    public void bulkDisableClient(List<String> clientUuids) throws NotFoundException {

    }

    @Override
    public void bulkEnableClient(List<String> clientUuids) throws NotFoundException {

    }

    @Override
    public void authorizeClient(String uuid, String raProfileUuid) throws NotFoundException {

    }

    @Override
    public void unauthorizeClient(String uuid, String raProfileUuid) throws NotFoundException {

    }

}
