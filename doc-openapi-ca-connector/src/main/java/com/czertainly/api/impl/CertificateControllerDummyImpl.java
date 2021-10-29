package com.czertainly.api.impl;

import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.interfaces.CertificateController;
import com.czertainly.api.model.ca.CertRevocationDto;
import com.czertainly.api.model.ca.CertificateSignRequestDto;
import com.czertainly.api.model.ca.CertificateSignResponseDto;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CertificateControllerDummyImpl implements CertificateController {

    @Override
    public CertificateSignResponseDto issueCertificate(Long aLong, String s, CertificateSignRequestDto certificateSignRequestDto) throws NotFoundException {
        return null;
    }

    @Override
    public void revokeCertificate(Long aLong, String s, CertRevocationDto certRevocationDto) throws NotFoundException {

    }

}
