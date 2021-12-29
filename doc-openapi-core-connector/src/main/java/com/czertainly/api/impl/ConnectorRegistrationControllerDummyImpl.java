package com.czertainly.api.impl;

import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.interfaces.core.connector.ConnectorRegistrationController;
import com.czertainly.api.model.core.connector.ConnectorDto;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnectorRegistrationControllerDummyImpl implements ConnectorRegistrationController {

    @Override
    public ConnectorDto register(ConnectorDto request) throws NotFoundException, AlreadyExistException {
        return null;
    }

}
