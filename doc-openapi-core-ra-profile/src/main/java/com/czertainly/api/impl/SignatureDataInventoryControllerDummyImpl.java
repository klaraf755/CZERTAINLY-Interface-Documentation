package com.czertainly.api.impl;

import com.czertainly.api.interfaces.core.web.SignatureDataInventoryController;
import com.czertainly.api.model.core.signature.SignedDataDto;
import com.czertainly.api.model.core.signature.SignedDataRequestDto;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignatureDataInventoryControllerDummyImpl implements SignatureDataInventoryController {
    @Override
    public SignedDataDto uploadSignedData(SignedDataRequestDto signedDataRequestDto) {
        return null;
    }

    @Override
    public void deleteSignedData(String uuid) {

    }
}
