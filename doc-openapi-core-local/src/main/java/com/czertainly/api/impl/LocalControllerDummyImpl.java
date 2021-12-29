package com.czertainly.api.impl;

import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.interfaces.core.local.LocalController;
import com.czertainly.api.model.client.admin.AddAdminRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.security.cert.CertificateException;

@RestController
public class LocalControllerDummyImpl implements LocalController {

    @Override
    public ResponseEntity<?> addAdmin(AddAdminRequestDto request) throws CertificateException, NotFoundException, AlreadyExistException {
        return null;
    }

}
