package com.czertainly.api.impl;

import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.interfaces.core.web.AuthController;
import com.czertainly.api.model.client.auth.EditAuthProfileDto;
import com.czertainly.api.model.core.auth.AuthProfileDto;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthControllerDummyImpl implements AuthController {

    @Override
    public AuthProfileDto profile() throws NotFoundException {
        return null;
    }

    @Override
    public void editProfile(EditAuthProfileDto authProfileDTO) throws NotFoundException {

    }

}
