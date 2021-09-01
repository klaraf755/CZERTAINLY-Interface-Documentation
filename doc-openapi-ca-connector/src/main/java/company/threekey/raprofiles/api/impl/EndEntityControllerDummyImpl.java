package company.threekey.raprofiles.api.impl;

import company.threekey.raprofiles.api.exception.AlreadyExistException;
import company.threekey.raprofiles.api.exception.NotFoundException;
import company.threekey.raprofiles.api.interfaces.EndEntityController;
import company.threekey.raprofiles.api.model.ca.AddEndEntityRequestDto;
import company.threekey.raprofiles.api.model.ca.EditEndEntityRequestDto;
import company.threekey.raprofiles.api.model.ca.EndEntityDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EndEntityControllerDummyImpl implements EndEntityController {

    @Override
    public List<EndEntityDto> listEndEntities(Long aLong, String s) throws NotFoundException {
        return null;
    }

    @Override
    public EndEntityDto getEndEntity(Long aLong, String s, String s1) throws NotFoundException {
        return null;
    }

    @Override
    public void createEndEntity(Long aLong, String s, AddEndEntityRequestDto addEndEntityRequestDto) throws NotFoundException, AlreadyExistException {

    }

    @Override
    public void updateEndEntity(Long aLong, String s, String s1, EditEndEntityRequestDto editEndEntityRequestDto) throws NotFoundException {

    }

    @Override
    public void removeEndEntity(Long aLong, String s, String s1) throws NotFoundException {

    }

    @Override
    public void resetPassword(Long aLong, String s, String s1) throws NotFoundException {

    }

}
