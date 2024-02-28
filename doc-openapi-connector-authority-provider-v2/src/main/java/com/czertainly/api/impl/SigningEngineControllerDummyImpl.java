package com.czertainly.api.impl;

import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.interfaces.connector.signing.SigningEngineController;
import com.czertainly.api.model.client.attribute.RequestAttributeDto;
import com.czertainly.api.model.common.attribute.v2.BaseAttribute;
import com.czertainly.api.model.connector.signing.SigningEngineDto;
import com.czertainly.api.model.connector.signing.SigningEngineRequestDto;
import com.czertainly.api.model.connector.signing.SigningEngineUpdateDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SigningEngineControllerDummyImpl implements SigningEngineController {
    @Override
    public List<SigningEngineDto> listSigningEngines() {
        return null;
    }

    @Override
    public SigningEngineDto getSingingEngine(String uuid) throws NotFoundException {
        return null;
    }

    @Override
    public SigningEngineDto createSigningEngine(SigningEngineRequestDto request) {
        return null;
    }

    @Override
    public SigningEngineDto updateSigningEngine(String uuid, SigningEngineUpdateDto request) throws NotFoundException {
        return null;
    }

    @Override
    public void removeSigningEngine(String uuid) throws NotFoundException {

    }

    @Override
    public void checkSigningEngineConnection(String signingEngineUuid) {

    }

    @Override
    public List<BaseAttribute> listSignatureProfileAttributes(String uuid) throws NotFoundException {
        return null;
    }

    @Override
    public void validateSignatureProfileAttributes(String uuid, List<RequestAttributeDto> attributes) throws ValidationException, NotFoundException {

    }
}
