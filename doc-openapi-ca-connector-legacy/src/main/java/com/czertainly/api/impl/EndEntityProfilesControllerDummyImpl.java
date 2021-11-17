package com.czertainly.api.impl;

import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.interfaces.EndEntityProfilesController;
import com.czertainly.api.model.NameAndIdDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EndEntityProfilesControllerDummyImpl implements EndEntityProfilesController {

    @Override
    public List<NameAndIdDto> listEntityProfiles(Long aLong) throws NotFoundException {
        return null;
    }

    @Override
    public List<NameAndIdDto> listCertificateProfiles(Long aLong, Integer integer) throws NotFoundException {
        return null;
    }

    @Override
    public List<NameAndIdDto> listCAsInProfile(Long aLong, Integer integer) throws NotFoundException {
        return null;
    }

}
