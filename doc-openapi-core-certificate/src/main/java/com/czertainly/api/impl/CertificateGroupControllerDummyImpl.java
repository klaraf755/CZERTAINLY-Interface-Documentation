package com.czertainly.api.impl;

import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.interfaces.core.web.CertificateGroupController;
import com.czertainly.api.model.core.certificate.group.CertificateGroupDto;
import com.czertainly.api.model.core.certificate.group.CertificateGroupRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CertificateGroupControllerDummyImpl implements CertificateGroupController {

    @Override
    public List<CertificateGroupDto> listCertificateGroups() {
        return null;
    }

    @Override
    public CertificateGroupDto getCertificateGroup(String uuid) throws NotFoundException {
        return null;
    }

    @Override
    public ResponseEntity<?> createCertificateGroup(CertificateGroupRequestDto request) throws AlreadyExistException, NotFoundException {
        return null;
    }

    @Override
    public CertificateGroupDto updateCertificateGroup(String uuid, CertificateGroupRequestDto request) throws NotFoundException {
        return null;
    }

    @Override
    public void removeCertificateGroup(String uuid) throws NotFoundException {

    }

    @Override
    public void bulkRemoveCertificateGroup(List<String> groupUuids) throws NotFoundException {

    }

}
