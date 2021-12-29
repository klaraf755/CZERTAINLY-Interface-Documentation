package com.czertainly.api.impl;

import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.interfaces.core.web.CertificateEntityController;
import com.czertainly.api.model.core.certificate.entity.CertificateEntityDto;
import com.czertainly.api.model.core.certificate.entity.CertificateEntityRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CertificateEntityControllerDummyImpl implements CertificateEntityController {

    @Override
    public List<CertificateEntityDto> listCertificateEntities() {
        return null;
    }

    @Override
    public CertificateEntityDto getCertificateEntity(String uuid) throws NotFoundException {
        return null;
    }

    @Override
    public ResponseEntity<?> createCertificateEntity(CertificateEntityRequestDto request) throws AlreadyExistException, NotFoundException {
        return null;
    }

    @Override
    public CertificateEntityDto updateCertificateEntity(String uuid, CertificateEntityRequestDto request) throws NotFoundException {
        return null;
    }

    @Override
    public void removeCertificateEntity(String uuid) throws NotFoundException {

    }

    @Override
    public void bulkRemoveCertificateEntity(List<String> entityUuids) throws NotFoundException {

    }

}
