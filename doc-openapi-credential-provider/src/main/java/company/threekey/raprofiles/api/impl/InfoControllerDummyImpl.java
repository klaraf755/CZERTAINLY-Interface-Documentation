package company.threekey.raprofiles.api.impl;

import company.threekey.raprofiles.api.interfaces.InfoController;
import company.threekey.raprofiles.api.model.connector.EndpointDto;
import company.threekey.raprofiles.api.model.connector.FunctionGroupCode;
import company.threekey.raprofiles.api.model.connector.InfoResponse;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class InfoControllerDummyImpl implements InfoController {

    @Override
    public List<InfoResponse> listSupportedFunctions() {
        return null;
    }

}
