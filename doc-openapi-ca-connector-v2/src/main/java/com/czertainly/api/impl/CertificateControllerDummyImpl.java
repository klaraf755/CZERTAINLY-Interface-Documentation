package com.czertainly.api.impl;

import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.model.AttributeDefinition;
import com.czertainly.api.v2.interfaces.CertificateController;
import com.czertainly.api.model.ca.CertificateSignResponseDto;
import com.czertainly.api.v2.model.ca.CertRevocationDto;
import com.czertainly.api.v2.model.ca.CertificateDataResponseDto;
import com.czertainly.api.v2.model.ca.CertificateRenewRequestDto;
import com.czertainly.api.v2.model.ca.CertificateSignRequestDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CertificateControllerDummyImpl implements CertificateController {

    @Override
    public List<AttributeDefinition> listIssueCertificateAttributes(Long aLong) throws NotFoundException {
        return null;
    }

    @Override
    public boolean validateIssueCertificateAttributes(Long aLong, List<AttributeDefinition> list) throws NotFoundException, ValidationException {
        return false;
    }

    @Override
    public CertificateDataResponseDto issueCertificate(Long aLong, CertificateSignRequestDto certificateSignRequestDto) throws NotFoundException {
        return null;
    }

    @Override
    public CertificateDataResponseDto renewCertificate(Long aLong, String s, CertificateRenewRequestDto certificateRenewRequestDto) throws NotFoundException {
        return null;
    }

    @Override
    public List<AttributeDefinition> listRevokeCertificateAttributes(Long aLong) throws NotFoundException {
        return null;
    }

    @Override
    public boolean validateRevokeCertificateAttributes(Long aLong, List<AttributeDefinition> list) throws NotFoundException, ValidationException {
        return false;
    }

    @Override
    public void revokeCertificate(Long aLong, String s, CertRevocationDto certRevocationDto) throws NotFoundException {

    }
}
