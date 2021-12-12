package com.czertainly.api.impl;

import com.czertainly.api.core.v2.interfaces.ClientOperationController;
import com.czertainly.api.core.v2.model.ClientCertificateDataResponseDto;
import com.czertainly.api.core.v2.model.ClientCertificateRenewRequestDto;
import com.czertainly.api.core.v2.model.ClientCertificateRevocationDto;
import com.czertainly.api.core.v2.model.ClientCertificateSignRequestDto;
import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.ConnectorException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.model.AttributeDefinition;
import org.springframework.web.bind.annotation.RestController;

import java.security.cert.CertificateException;
import java.util.List;

@RestController
public class ClientOperationControllerDummyImpl implements ClientOperationController {

    @Override
    public List<AttributeDefinition> listIssueCertificateAttributes(String s) throws NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public boolean validateIssueCertificateAttributes(String s, List<AttributeDefinition> list) throws NotFoundException, ConnectorException, ValidationException {
        return false;
    }

    @Override
    public ClientCertificateDataResponseDto issueCertificate(String s, ClientCertificateSignRequestDto clientCertificateSignRequestDto) throws NotFoundException, ConnectorException, AlreadyExistException, CertificateException {
        return null;
    }

    @Override
    public ClientCertificateDataResponseDto renewCertificate(String s, String s1, ClientCertificateRenewRequestDto clientCertificateRenewRequestDto) throws NotFoundException, ConnectorException, AlreadyExistException, CertificateException {
        return null;
    }

    @Override
    public List<AttributeDefinition> listRevokeCertificateAttributes(String s) throws NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public boolean validateRevokeCertificateAttributes(String s, List<AttributeDefinition> list) throws NotFoundException, ConnectorException, ValidationException {
        return false;
    }

    @Override
    public void revokeCertificate(String s, String s1, ClientCertificateRevocationDto clientCertificateRevocationDto) throws NotFoundException, ConnectorException {

    }
}
