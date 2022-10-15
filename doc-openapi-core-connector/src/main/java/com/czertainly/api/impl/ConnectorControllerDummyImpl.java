package com.czertainly.api.impl;

import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.ConnectorException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.interfaces.core.web.ConnectorController;
import com.czertainly.api.model.client.connector.*;
import com.czertainly.api.model.common.BulkActionMessageDto;
import com.czertainly.api.model.common.attribute.AttributeDefinition;
import com.czertainly.api.model.common.HealthDto;
import com.czertainly.api.model.common.attribute.RequestAttributeDto;
import com.czertainly.api.model.core.connector.ConnectorDto;
import com.czertainly.api.model.core.connector.ConnectorStatus;
import com.czertainly.api.model.core.connector.FunctionGroupCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.net.ConnectException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class ConnectorControllerDummyImpl implements ConnectorController {
    @Override
    public List<ConnectorDto> listConnectors(Optional<FunctionGroupCode> functionGroup, Optional<String> kind, Optional<ConnectorStatus> status) throws NotFoundException {
        return null;
    }

    @Override
    public ConnectorDto getConnector(String uuid) throws NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public ResponseEntity<?> createConnector(ConnectorRequestDto request) throws AlreadyExistException, ConnectorException {
        return null;
    }

    @Override
    public ConnectorDto editConnector(String uuid, ConnectorUpdateRequestDto request) throws ConnectorException {
        return null;
    }

    @Override
    public void deleteConnector(String uuid) throws NotFoundException {

    }

    @Override
    public List<ConnectDto> connect(ConnectRequestDto request) throws ValidationException, ConnectException, ConnectorException {
        return null;
    }

    @Override
    public List<ConnectDto> reconnect(String uuid) throws ValidationException, NotFoundException, ConnectException, ConnectorException {
        return null;
    }

    @Override
    public void bulkApprove(List<String> uuids) throws NotFoundException, ValidationException {

    }

    @Override
    public void bulkReconnect(List<String> uuids) throws ValidationException, NotFoundException, ConnectException, ConnectorException {

    }

    @Override
    public void approve(String uuid) throws NotFoundException, ValidationException {

    }

    @Override
    public HealthDto checkHealth(String uuid) throws NotFoundException, ValidationException, ConnectorException {
        return null;
    }

    @Override
    public List<AttributeDefinition> getAttributes(String uuid, String functionGroup, String kind) throws NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public Map<FunctionGroupCode, Map<String, List<AttributeDefinition>>> getAttributesAll(String uuid) throws NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public void validateAttributes(String uuid, String functionGroup, String kind, List<RequestAttributeDto> attributes) throws NotFoundException, ConnectorException {

    }

    @Override
    public List<BulkActionMessageDto> bulkDeleteConnector(List<String> uuids) throws NotFoundException, ValidationException, ConnectorException {
        return null;
    }

    @Override
    public List<BulkActionMessageDto> forceDeleteConnector(List<String> uuids) throws NotFoundException, ValidationException {
        return null;
    }
}
