package com.czertainly.api.impl;

import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.interfaces.connector.v2.CertificateController;
import com.czertainly.api.model.common.AttributeDefinition;
import com.czertainly.api.model.common.RequestAttributeDto;
import com.czertainly.api.model.connector.v2.CertRevocationDto;
import com.czertainly.api.model.connector.v2.CertificateDataResponseDto;
import com.czertainly.api.model.connector.v2.CertificateRenewRequestDto;
import com.czertainly.api.model.connector.v2.CertificateSignRequestDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CertificateControllerDummyImpl implements CertificateController {

    @Override
    public List<AttributeDefinition> listIssueCertificateAttributes(String uuid) throws NotFoundException {
        return null;
    }

    @Override
    public boolean validateIssueCertificateAttributes(String uuid, List<RequestAttributeDto> attributes) throws NotFoundException, ValidationException {
        return false;
    }

    @Override
    public CertificateDataResponseDto issueCertificate(String uuid, CertificateSignRequestDto request) throws NotFoundException {
        return null;
    }

    @Override
    public CertificateDataResponseDto renewCertificate(String uuid, CertificateRenewRequestDto request) throws NotFoundException {
        return null;
    }

    @Override
    public List<AttributeDefinition> listRevokeCertificateAttributes(String uuid) throws NotFoundException {
        return null;
    }

    @Override
    public boolean validateRevokeCertificateAttributes(String uuid, List<RequestAttributeDto> attributes) throws NotFoundException, ValidationException {
        return false;
    }

    @Override
    public void revokeCertificate(String uuid, CertRevocationDto request) throws NotFoundException {

    }

}
