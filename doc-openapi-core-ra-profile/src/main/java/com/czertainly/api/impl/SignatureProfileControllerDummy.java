package com.czertainly.api.impl;

import com.czertainly.api.interfaces.core.web.SignatureProfileController;
import com.czertainly.api.model.core.signature.SignatureProfileDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SignatureProfileControllerDummy implements SignatureProfileController {
    @Override
    public List<SignatureProfileDto> listSignatureProfiles() {
        return null;
    }
}
