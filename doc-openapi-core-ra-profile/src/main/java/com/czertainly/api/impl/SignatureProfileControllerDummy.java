package com.czertainly.api.impl;

import com.czertainly.api.interfaces.core.web.SignatureProfileController;
import com.czertainly.api.model.client.attribute.ResponseAttributeDto;
import com.czertainly.api.model.core.signature.SignatureProfileDto;
import com.czertainly.api.model.core.signature.SignatureProfileRequestDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SignatureProfileControllerDummy implements SignatureProfileController {
    @Override
    public List<SignatureProfileDto> listSignatureProfiles() {
        return null;
    }

    @Override
    public SignatureProfileDto createSignatureProfile(SignatureProfileRequestDto signatureProfileRequestDto) {
        return null;
    }

    @Override
    public SignatureProfileDto getSignatureProfileDetails(String signatureProfileUuid) {
        return null;
    }

    @Override
    public SignatureProfileDto updateSignatureProfile(String signatureProfileUuid, SignatureProfileRequestDto signatureProfileRequestDto) {
        return null;
    }

    @Override
    public void deleteSignatureProfile(String signatureProfileUuid) {

    }

    @Override
    public List<ResponseAttributeDto> listSignatureProfileAttributes(String signatureProfileUuid) {
        return null;
    }
}
