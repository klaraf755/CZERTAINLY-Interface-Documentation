package company.threekey.raprofiles.api.impl;

import company.threekey.raprofiles.api.exception.NotFoundException;
import company.threekey.raprofiles.api.interfaces.CertificateController;
import company.threekey.raprofiles.api.model.CertRevocationDto;
import company.threekey.raprofiles.api.model.CertificateSignRequestDto;
import company.threekey.raprofiles.api.model.CertificateSignResponseDto;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CertificateControllerDummyImpl implements CertificateController {

    @Override
    public CertificateSignResponseDto issueCertificate(Long aLong, String s, CertificateSignRequestDto certificateSignRequestDto) throws NotFoundException {
        return null;
    }

    @Override
    public void revokeCertificate(Long aLong, String s, CertRevocationDto certRevocationDto) throws NotFoundException {

    }

}
