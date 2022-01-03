package com.czertainly.api.impl;

import com.czertainly.api.exception.ConnectorException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.exception.ValidationException;
import com.czertainly.api.interfaces.core.web.CallbackController;
import com.czertainly.api.model.common.RequestAttributeCallback;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallbackControllerDummyImpl implements CallbackController {

    @Override
    public Object callback(String uuid, String functionGroup, String kind, RequestAttributeCallback callback) throws NotFoundException, ConnectorException, ValidationException {
        return null;
    }

    @Override
    public Object raProfileCallback(String authorityUuid, RequestAttributeCallback callback) throws NotFoundException, ConnectorException, ValidationException {
        return null;
    }

}
