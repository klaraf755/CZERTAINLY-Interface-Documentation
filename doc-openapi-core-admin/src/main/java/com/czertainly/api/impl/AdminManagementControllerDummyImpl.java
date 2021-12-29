package com.czertainly.api.impl;

import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.interfaces.core.web.AdminManagementController;
import com.czertainly.api.model.client.admin.AddAdminRequestDto;
import com.czertainly.api.model.client.admin.EditAdminRequestDto;
import com.czertainly.api.model.core.admin.AdminDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.security.cert.CertificateException;
import java.util.List;

@RestController
public class AdminManagementControllerDummyImpl implements AdminManagementController {

    @Override
    public List<AdminDto> listAdmins() {
        return null;
    }

    @Override
    public ResponseEntity<?> addAdmin(AddAdminRequestDto request) throws CertificateException, AlreadyExistException, ValidationException, NotFoundException {
        return null;
    }

    @Override
    public AdminDto getAdmin(String uuid) throws NotFoundException {
        return null;
    }

    @Override
    public AdminDto editAdmin(String uuid, EditAdminRequestDto request) throws CertificateException, NotFoundException, AlreadyExistException {
        return null;
    }

    @Override
    public void bulkRemoveAdmin(List<String> adminUuids) throws NotFoundException {

    }

    @Override
    public void removeAdmin(String uuid) throws NotFoundException {

    }

    @Override
    public void disableAdmin(String uuid) throws NotFoundException {

    }

    @Override
    public void enableAdmin(String uuid) throws NotFoundException, CertificateException {

    }

    @Override
    public void bulkDisableAdmin(List<String> adminUuids) throws NotFoundException {

    }

    @Override
    public void bulkEnableAdmin(List<String> adminUuids) throws NotFoundException {

    }

}
