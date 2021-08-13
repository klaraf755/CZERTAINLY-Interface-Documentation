package company.threekey.raprofiles.api.impl;

import company.threekey.raprofiles.api.exception.AlreadyExistException;
import company.threekey.raprofiles.api.exception.NotFoundException;
import company.threekey.raprofiles.api.interfaces.CAInstaceController;
import company.threekey.raprofiles.api.model.CAInstanceDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CAInstanceControllerDummyImpl implements CAInstaceController {

    @Override
    public List<CAInstanceDto> listCAInstances() {
        return null;
    }

    @Override
    public CAInstanceDto getCAInstance(Long aLong) throws NotFoundException {
        return null;
    }

    @Override
    public CAInstanceDto createCAInstance(CAInstanceDto caInstanceDto) throws AlreadyExistException {
        return null;
    }

    @Override
    public CAInstanceDto updateCAInstance(Long aLong, CAInstanceDto caInstanceDto) throws NotFoundException {
        return null;
    }

    @Override
    public void removeCAInstance(Long aLong) throws NotFoundException {

    }

    @Override
    public void getConnection(Long aLong) throws NotFoundException {

    }

}
