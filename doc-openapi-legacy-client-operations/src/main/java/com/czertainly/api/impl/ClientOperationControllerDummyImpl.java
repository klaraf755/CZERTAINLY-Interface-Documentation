package com.czertainly.api.impl;

import com.czertainly.api.core.interfaces.client.ClientOperationController;
import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.model.ca.*;
import org.springframework.web.bind.annotation.RestController;

import java.security.cert.CertificateException;
import java.util.List;

@RestController
public class ClientOperationControllerDummyImpl implements ClientOperationController {

    @Override
    public CertificateSignResponseDto issueCertificate(String s, CertificateSignRequestDto certificateSignRequestDto) throws NotFoundException, CertificateException, AlreadyExistException {
        return null;
    }

    @Override
    public void revokeCertificate(String s, CertRevocationDto certRevocationDto) throws NotFoundException {

    }

    @Override
    public List<EndEntityDto> listEntities(String s) throws NotFoundException {
        return null;
    }

    @Override
    public void addEndEntity(String s, AddEndEntityRequestDto addEndEntityRequestDto) throws NotFoundException, AlreadyExistException {

    }

    @Override
    public EndEntityDto getEndEntity(String s, String s1) throws NotFoundException {
        return null;
    }

    @Override
    public void editEndEntity(String s, String s1, EditEndEntityRequestDto editEndEntityRequestDto) throws NotFoundException {

    }

    @Override
    public void revokeAndDeleteEndEntity(String s, String s1) throws NotFoundException {

    }

    @Override
    public void resetPassword(String s, String s1) throws NotFoundException {

    }
}
