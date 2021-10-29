package com.czertainly.api.impl;

import com.czertainly.api.core.v2.interfaces.ClientOperationController;
import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.model.AttributeDefinition;
import com.czertainly.api.v2.model.ca.CertRevocationDto;
import com.czertainly.api.v2.model.ca.CertificateDataResponseDto;
import com.czertainly.api.v2.model.ca.CertificateRenewRequestDto;
import com.czertainly.api.v2.model.ca.CertificateSignRequestDto;
import org.springframework.web.bind.annotation.RestController;

import java.security.cert.CertificateException;
import java.util.List;

@RestController
public class ClientOperationControllerDummyImpl implements ClientOperationController {

    @Override
    public List<AttributeDefinition> listIssueCertificateAttributes(String s) throws NotFoundException {
        return null;
    }

    @Override
    public boolean validateIssueCertificateAttributes(String s, List<AttributeDefinition> list) throws NotFoundException, ValidationException {
        return false;
    }

    @Override
    public CertificateDataResponseDto issueCertificate(String s, CertificateSignRequestDto certificateSignRequestDto) throws NotFoundException, AlreadyExistException, CertificateException {
        return null;
    }

    @Override
    public CertificateDataResponseDto renewCertificate(String s, String s1, CertificateRenewRequestDto certificateRenewRequestDto) throws NotFoundException, AlreadyExistException, CertificateException {
        return null;
    }

    @Override
    public List<AttributeDefinition> listRevokeCertificateAttributes(String s) throws NotFoundException {
        return null;
    }

    @Override
    public boolean validateRevokeCertificateAttributes(String s, List<AttributeDefinition> list) throws NotFoundException, ValidationException {
        return false;
    }

    @Override
    public void revokeCertificate(String s, String s1, CertRevocationDto certRevocationDto) throws NotFoundException {

    }
}
