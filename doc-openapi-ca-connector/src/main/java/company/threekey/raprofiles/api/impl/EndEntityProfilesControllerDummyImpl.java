package company.threekey.raprofiles.api.impl;

import company.threekey.raprofiles.api.exception.NotFoundException;
import company.threekey.raprofiles.api.interfaces.EndEntityProfilesController;
import company.threekey.raprofiles.api.model.NameAndIdDTO;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EndEntityProfilesControllerDummyImpl implements EndEntityProfilesController {

    @Override
    public List<NameAndIdDTO> listEntityProfiles(Long aLong) throws NotFoundException {
        return null;
    }

    @Override
    public List<NameAndIdDTO> listCertificateProfiles(Long aLong, Integer integer) throws NotFoundException {
        return null;
    }

    @Override
    public List<NameAndIdDTO> listCAsInProfile(Long aLong, Integer integer) throws NotFoundException {
        return null;
    }

}
