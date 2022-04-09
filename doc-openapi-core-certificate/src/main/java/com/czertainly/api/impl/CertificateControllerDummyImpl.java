package com.czertainly.api.impl;

import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.interfaces.core.web.CertificateController;
import com.czertainly.api.model.client.certificate.*;
import com.czertainly.api.model.client.certificate.owner.CertificateOwnerBulkUpdateDto;
import com.czertainly.api.model.client.certificate.owner.CertificateOwnerRequestDto;
import com.czertainly.api.model.common.UuidDto;
import com.czertainly.api.model.core.certificate.CertificateDto;
import com.czertainly.api.model.core.certificate.CertificateEventHistoryDto;
import com.czertainly.api.model.core.search.SearchFieldDataDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.cert.CertificateException;
import java.util.List;

@RestController
public class CertificateControllerDummyImpl implements CertificateController {

    @Override
    public CertificateResponseDto listCertificate(SearchRequestDto request) throws ValidationException {
        return null;
    }

    @Override
    public CertificateDto getCertificate(String uuid) throws NotFoundException, CertificateException, IOException {
        return null;
    }

    @Override
    public void removeCertificate(String uuid) throws NotFoundException {

    }

    @Override
    public void updateRaProfile(String uuid, CertificateUpdateRAProfileDto request) throws NotFoundException {

    }

    @Override
    public void updateCertificateGroup(String uuid, CertificateUpdateGroupDto request) throws NotFoundException {

    }

    @Override
    public void updateEntity(String uuid, CertificateUpdateEntityDto request) throws NotFoundException {

    }

    @Override
    public void updateOwner(String uuid, CertificateOwnerRequestDto request) throws NotFoundException {

    }

    @Override
    public void check(String uuid) throws CertificateException, IOException, NotFoundException {

    }

    @Override
    public void bulkUpdateRaProfile(MultipleRAProfileUpdateDto request) throws NotFoundException {

    }

    @Override
    public void bulkUpdateCertificateGroup(MultipleGroupUpdateDto request) throws NotFoundException {

    }

    @Override
    public void bulkUpdateEntity(MultipleEntityUpdateDto request) throws NotFoundException {

    }

    @Override
    public void bulkUpdateOwner(CertificateOwnerBulkUpdateDto request) throws NotFoundException {

    }

    @Override
    public ResponseEntity<UuidDto> upload(UploadCertificateRequestDto request) throws AlreadyExistException, CertificateException {
        return null;
    }

    @Override
    public BulkOperationResponse bulkRemoveCertificate(RemoveCertificateDto request) throws NotFoundException {
        return null;
    }

    @Override
    public void validateAllCertificate() {

    }

    @Override
    public List<SearchFieldDataDto> getSearchableFieldInformation() {
        return null;
    }

    @Override
    public List<CertificateEventHistoryDto> getCertificateEventHistory(String uuid) throws NotFoundException {
        return null;
    }

}
