package com.czertainly.api.impl;

import com.czertainly.api.exception.AlreadyExistException;
import com.czertainly.api.exception.NotFoundException;
import com.czertainly.api.interfaces.EndEntityController;
import com.czertainly.api.model.ca.AddEndEntityRequestDto;
import com.czertainly.api.model.ca.EditEndEntityRequestDto;
import com.czertainly.api.model.ca.EndEntityDto;
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
