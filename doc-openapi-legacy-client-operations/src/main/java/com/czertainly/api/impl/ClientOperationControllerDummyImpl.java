package com.czertainly.api.impl;

import com.czertainly.api.core.interfaces.client.ClientOperationController;
import com.czertainly.api.core.modal.*;
import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.ConnectorException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.model.ca.*;
import org.springframework.web.bind.annotation.RestController;

import java.security.cert.CertificateException;
import java.util.List;

@RestController
public class ClientOperationControllerDummyImpl implements ClientOperationController {

    @Override
    public ClientCertificateSignResponseDto issueCertificate(String s, ClientCertificateSignRequestDto clientCertificateSignRequestDto) throws NotFoundException, CertificateException, AlreadyExistException, ConnectorException {
        return null;
    }

    @Override
    public void revokeCertificate(String s, ClientCertificateRevocationDto clientCertificateRevocationDto) throws NotFoundException, ConnectorException {

    }

    @Override
    public List<ClientEndEntityDto> listEntities(String s) throws NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public void addEndEntity(String s, ClientAddEndEntityRequestDto clientAddEndEntityRequestDto) throws NotFoundException, AlreadyExistException, ConnectorException {

    }

    @Override
    public ClientEndEntityDto getEndEntity(String s, String s1) throws NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public void editEndEntity(String s, String s1, ClientEditEndEntityRequestDto clientEditEndEntityRequestDto) throws NotFoundException, ConnectorException {

    }

    @Override
    public void revokeAndDeleteEndEntity(String s, String s1) throws NotFoundException, ConnectorException {

    }

    @Override
    public void resetPassword(String s, String s1) throws NotFoundException, ConnectorException {

    }
}
