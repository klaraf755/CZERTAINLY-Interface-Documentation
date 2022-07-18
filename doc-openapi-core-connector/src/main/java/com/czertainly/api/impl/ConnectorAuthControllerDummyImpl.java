package com.czertainly.api.impl;

import com.czertainly.api.interfaces.core.web.ConnectorAuthController;
import com.czertainly.api.model.common.attribute.AttributeDefinition;
import com.czertainly.api.model.common.attribute.RequestAttributeDto;
import com.czertainly.api.model.core.connector.AuthType;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class ConnectorAuthControllerDummyImpl implements ConnectorAuthController {

    @Override
    public Set<AuthType> getAuthenticationTypes() {
        return null;
    }

    @Override
    public List<AttributeDefinition> getBasicAuthAttributes() {
        return null;
    }

    @Override
    public void validateBasicAuthAttributes(List<RequestAttributeDto> attributes) {

    }

    @Override
    public List<AttributeDefinition> getCertificateAttributes() {
        return null;
    }

    @Override
    public void validateCertificateAttributes(List<RequestAttributeDto> attributes) {

    }

    @Override
    public List<AttributeDefinition> getApiKeyAuthAttributes() {
        return null;
    }

    @Override
    public void validateApiKeyAuthAttributes(List<RequestAttributeDto> attributes) {

    }

    @Override
    public List<AttributeDefinition> getJWTAuthAttributes() {
        return null;
    }

    @Override
    public void validateJWTAuthAttributes(List<RequestAttributeDto> attributes) {

    }

}
