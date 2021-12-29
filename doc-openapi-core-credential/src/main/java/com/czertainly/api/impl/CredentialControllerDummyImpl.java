package com.czertainly.api.impl;

import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.ConnectorException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.interfaces.core.web.CredentialController;
import com.czertainly.api.model.client.connector.ForceDeleteMessageDto;
import com.czertainly.api.model.common.UuidDto;
import com.czertainly.api.model.core.credential.CredentialDto;
import com.czertainly.api.model.core.credential.CredentialRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CredentialControllerDummyImpl implements CredentialController {

    @Override
    public List<CredentialDto> listCredentials() {
        return null;
    }

    @Override
    public CredentialDto getCredential(String uuid) throws NotFoundException {
        return null;
    }

    @Override
    @Operation(summary = "Add a new Credential")
    @ApiResponses(value = { @ApiResponse(responseCode = "201", description = "New Credential added", content = @Content(schema = @Schema(implementation = UuidDto.class))),
            @ApiResponse(responseCode = "400", description = "Invalid request", content = @Content),
            @ApiResponse(responseCode = "422", description = "Unprocessable Entity", content = @Content),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content) })
    @RequestMapping(method = RequestMethod.POST, consumes = { "application/json" }, produces = { "application/json" })
    public ResponseEntity<?> createCredential(CredentialRequestDto request) throws AlreadyExistException, NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public CredentialDto updateCredential(String uuid, CredentialRequestDto request) throws NotFoundException, ConnectorException {
        return null;
    }

    @Override
    public void removeCredential(String uuid) throws NotFoundException {

    }

    @Override
    public void enableCredential(String uuid) throws NotFoundException {

    }

    @Override
    public void disableCredential(String uuid) throws NotFoundException {

    }

    @Override
    public List<ForceDeleteMessageDto> bulkRemoveCredential(List<String> uuids) throws NotFoundException, ValidationException {
        return null;
    }

    @Override
    public void bulkForceRemoveCredential(List<String> uuids) throws NotFoundException, ValidationException {

    }

}
