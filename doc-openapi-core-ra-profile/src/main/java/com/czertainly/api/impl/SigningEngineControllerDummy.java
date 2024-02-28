package com.czertainly.api.impl;

import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.ConnectorException;
import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.interfaces.core.web.SignatureProfileController;
import com.czertainly.api.interfaces.core.web.SigningEngineController;
import com.czertainly.api.model.client.attribute.ResponseAttributeDto;
import com.czertainly.api.model.client.raprofile.AddRaProfileRequestDto;
import com.czertainly.api.model.core.signature.AddSigningEngineDto;
import com.czertainly.api.model.core.signature.SignatureProfileDto;
import com.czertainly.api.model.core.signature.SigningEngineDto;


import com.czertainly.api.model.core.signature.UpdateSigningEngineDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class SigningEngineControllerDummy implements SigningEngineController {
    @Override 
    public List<SigningEngineDto> listSigningEngine() {
    return null;
    }

    @Override
    public SigningEngineDto createSigningEngineInstance(AddSigningEngineDto addSigningEngineDto) {
        return null;
    }

    @Override
    public SigningEngineDto getSigningEngineInstance(String signingEngineUuid) {
        return null;
    }

    @Override
    public SigningEngineDto updateSignatureProfile(String signingEngineUuid, UpdateSigningEngineDto updateSigningEngineDto) {
        return null;
    }

    @Override
    public void deleteSigningEngine(String signingEngineUuid) {

    }

    @Override
    public List<ResponseAttributeDto> listSigningEngineAttributes(String signingEngineUuid) {
        return null;
    }



}
