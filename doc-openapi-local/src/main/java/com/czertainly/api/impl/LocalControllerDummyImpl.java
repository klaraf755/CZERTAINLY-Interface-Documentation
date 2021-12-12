package com.czertainly.api.impl;

import com.czertainly.api.core.interfaces.local.LocalController;
import com.czertainly.api.core.modal.AddAdminRequestDto;
import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.security.cert.CertificateException;

@RestController
public class LocalControllerDummyImpl implements LocalController {

    @Override
    public ResponseEntity<?> addAdmin(AddAdminRequestDto addAdminRequestDto) throws CertificateException, NotFoundException, AlreadyExistException {
        return null;
    }
}
