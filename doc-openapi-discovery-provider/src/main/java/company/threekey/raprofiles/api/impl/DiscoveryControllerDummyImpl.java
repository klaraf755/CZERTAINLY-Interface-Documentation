package company.threekey.raprofiles.api.impl;

import java.io.IOException;

import org.springframework.web.bind.annotation.RestController;

import company.threekey.raprofiles.api.exception.NotFoundException;
import company.threekey.raprofiles.api.interfaces.DiscoveryController;
import company.threekey.raprofiles.api.model.discovery.DiscoveryProviderDto;

@RestController
public class DiscoveryControllerDummyImpl implements DiscoveryController {

	@Override
	public DiscoveryProviderDto discoverCertificate(DiscoveryProviderDto request)
			throws IOException, NotFoundException {
		return null;
	}
}
