package com.czertainly.api.impl;

import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.ConnectorException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.interfaces.core.web.AuthorityInstanceController;
import com.czertainly.api.model.client.authority.AuthorityInstanceRequestDto;
import com.czertainly.api.model.client.connector.ForceDeleteMessageDto;
import com.czertainly.api.model.common.AttributeDefinition;
import com.czertainly.api.model.common.NameAndIdDto;
import com.czertainly.api.model.common.RequestAttributeDto;
import com.czertainly.api.model.core.authority.AuthorityInstanceDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorityInstanceControllerDummyImpl implements AuthorityInstanceController {

    @Override
    public List<AuthorityInstanceDto> listAuthorityInstances() {
        return null;
    }

    @Override
    public AuthorityInstanceDto getAuthorityInstance(String uuid) throws NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public ResponseEntity<?> createAuthorityInstance(AuthorityInstanceRequestDto request) throws AlreadyExistException, NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public AuthorityInstanceDto updateAuthorityInstance(String uuid, AuthorityInstanceRequestDto request) throws NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public void removeAuthorityInstance(String uuid) throws NotFoundException, ConnectorException {

    }

    @Override
    public List<NameAndIdDto> listEntityProfiles(String uuid) throws NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public List<NameAndIdDto> listCertificateProfiles(String uuid, Integer endEntityProfileId) throws NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public List<NameAndIdDto> listCAsInProfile(String uuid, Integer endEntityProfileId) throws NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public List<AttributeDefinition> listRAProfileAttributes(String uuid) throws NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public Boolean validateRAProfileAttributes(String uuid, List<RequestAttributeDto> attributes) throws NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public List<ForceDeleteMessageDto> bulkRemoveAuthorityInstance(List<String> uuids) throws NotFoundException, ConnectorException, ValidationException {
        return null;
    }

    @Override
    public void bulkForceRemoveAuthorityInstance(List<String> uuids) throws NotFoundException, ValidationException {

    }

}
