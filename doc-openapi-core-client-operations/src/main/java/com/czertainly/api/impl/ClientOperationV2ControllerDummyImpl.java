package com.czertainly.api.impl;

import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.ConnectorException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.interfaces.core.client.v2.ClientOperationController;
import com.czertainly.api.model.common.AttributeDefinition;
import com.czertainly.api.model.common.RequestAttributeDto;
import com.czertainly.api.model.core.v2.ClientCertificateDataResponseDto;
import com.czertainly.api.model.core.v2.ClientCertificateRenewRequestDto;
import com.czertainly.api.model.core.v2.ClientCertificateRevocationDto;
import com.czertainly.api.model.core.v2.ClientCertificateSignRequestDto;
import org.springframework.web.bind.annotation.RestController;

import java.security.cert.CertificateException;
import java.util.List;

@RestController
public class ClientOperationV2ControllerDummyImpl implements ClientOperationController {

    @Override
    public List<AttributeDefinition> listIssueCertificateAttributes(String raProfileUuid) throws NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public void validateIssueCertificateAttributes(String raProfileUuid, List<RequestAttributeDto> attributes) throws NotFoundException, ConnectorException, ValidationException {

    }

    @Override
    public ClientCertificateDataResponseDto issueCertificate(String raProfileUuid, ClientCertificateSignRequestDto request) throws NotFoundException, ConnectorException, AlreadyExistException, CertificateException {
        return null;
    }

    @Override
    public ClientCertificateDataResponseDto renewCertificate(String raProfileUuid, String certificateUuid, ClientCertificateRenewRequestDto request) throws NotFoundException, ConnectorException, AlreadyExistException, CertificateException {
        return null;
    }

    @Override
    public List<AttributeDefinition> listRevokeCertificateAttributes(String raProfileUuid) throws NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public void validateRevokeCertificateAttributes(String raProfileUuid, List<RequestAttributeDto> attributes) throws NotFoundException, ConnectorException, ValidationException {

    }

    @Override
    public void revokeCertificate(String raProfileUuid, String certificateUuid, ClientCertificateRevocationDto request) throws NotFoundException, ConnectorException {

    }

}
