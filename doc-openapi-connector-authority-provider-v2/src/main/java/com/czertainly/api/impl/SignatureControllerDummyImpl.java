package com.czertainly.api.impl;

import com.czertainly.api.interfaces.connector.signing.SignatureController;
import com.czertainly.api.model.client.attribute.RequestAttributeDto;
import com.czertainly.api.model.common.attribute.v2.BaseAttribute;
import com.czertainly.api.model.connector.signing.SignRequestDto;
import com.czertainly.api.model.connector.signing.SignatureValidationRequestDto;
import com.czertainly.api.model.core.signature.SignedDataDto;

import java.util.List;

public class SignatureControllerDummyImpl implements SignatureController {
    @Override
    public SignedDataDto sign(SignRequestDto signRequestDto) {
        return null;
    }

    @Override
    public List<BaseAttribute> listSignatureAttributes() {
        return null;
    }

    @Override
    public void validateSignatureAttributes(List<RequestAttributeDto> attributes) {

    }

    @Override
    public void validateSignature(SignatureValidationRequestDto signatureValidationRequestDto) {

    }
}
