package company.threekey.raprofiles.api.impl;

import company.threekey.raprofiles.api.interfaces.DiscoveryController;
import company.threekey.raprofiles.api.model.discovery.DiscoveryDto;
import company.threekey.raprofiles.api.model.discovery.DiscoveryHistoryDto;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class DiscoveryControllerDummyImpl implements DiscoveryController {

    @Override
    public DiscoveryHistoryDto discoverCertificate(DiscoveryDto discoveryDto) throws IOException {
        return null;
    }
}
