package com.fertisa.ec.ws.internal;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.fertisa.ec.ws.client.generated.VisitDetails;
import com.fertisa.ec.ws.repository.VisitRepository;

import ec.com.fertisa.webservices.internal.Driver;
import ec.com.fertisa.webservices.internal.FindAllVisitIntRequest;
import ec.com.fertisa.webservices.internal.FindAllVisitIntResponse;
import ec.com.fertisa.webservices.internal.VisitDetailsInt;

@Endpoint
public class VisitEndpoint {
	private static final String NAMESPACE_URI = "http://fertisa.com.ec/webservices/internal";

	private VisitRepository visitRepository = new VisitRepository();

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "FindAllVisitIntRequest")
	@ResponsePayload
	public FindAllVisitIntResponse getFindAllVisit(@RequestPayload FindAllVisitIntRequest request) {
		FindAllVisitIntResponse response = new FindAllVisitIntResponse();
		VisitDetailsInt visitInt;
		Driver driver;
		
		for (VisitDetails visit : visitRepository.findAll()) {
			driver = new Driver();
			visitInt = new VisitDetailsInt();
			driver.setDriverName(visit.getDriver().getDriverName());
			visitInt.setDriver(driver); 
			response.getVisitDetailsInt().add(visitInt);
		}

		// response.getVisitDetails().add(null) = visitRepository.findAll();

		return response;
	}
}
