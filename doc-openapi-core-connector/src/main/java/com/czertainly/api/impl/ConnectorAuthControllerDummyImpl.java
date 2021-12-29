package com.czertainly.api.impl;

import com.czertainly.api.interfaces.core.web.ConnectorAuthController;
import com.czertainly.api.model.common.AttributeDefinition;
import com.czertainly.api.model.common.RequestAttributeDto;
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
    public Boolean validateBasicAuthAttributes(List<RequestAttributeDto> attributes) {
        return null;
    }

    @Override
    public List<AttributeDefinition> getCertificateAttributes() {
        return null;
    }

    @Override
    public Boolean validateCertificateAttributes(List<RequestAttributeDto> attributes) {
        return null;
    }

    @Override
    public List<AttributeDefinition> getApiKeyAuthAttributes() {
        return null;
    }

    @Override
    public Boolean validateApiKeyAuthAttributes(List<RequestAttributeDto> attributes) {
        return null;
    }

    @Override
    public List<AttributeDefinition> getJWTAuthAttributes() {
        return null;
    }

    @Override
    public Boolean validateJWTAuthAttributes(List<RequestAttributeDto> attributes) {
        return null;
    }

}
