package company.threekey.raprofiles.api.impl;

import company.threekey.raprofiles.api.exception.NotFoundException;
import company.threekey.raprofiles.api.interfaces.EndEntityProfilesController;
import company.threekey.raprofiles.api.model.ca.NameAndIdDto;
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
