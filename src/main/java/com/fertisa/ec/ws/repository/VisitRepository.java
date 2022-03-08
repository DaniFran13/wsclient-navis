package com.fertisa.ec.ws.repository;

import java.util.List;

import com.fertisa.ec.ws.client.generated.FindAllVisitRequest;
import com.fertisa.ec.ws.client.generated.FindAllVisitResponse;
import com.fertisa.ec.ws.client.generated.VisitDetails;
import com.fertisa.ec.ws.client.generated.VisitPort;
import com.fertisa.ec.ws.client.generated.VisitPortService;

public class VisitRepository {

	public List<VisitDetails> findAll() {

		FindAllVisitRequest request = new FindAllVisitRequest();
		FindAllVisitResponse response = new FindAllVisitResponse();

		VisitPortService service = new VisitPortService();
		VisitPort visitService = service.getVisitPortSoap11();

		response = visitService.findAllVisit(request);

		/*
		 * for (VisitDetails rs : response.getVisitDetails()) {
		 * System.out.println(rs.getDriver().getDriverName() + "-" +
		 * rs.getCargo().getType()); }
		 */
		return response.getVisitDetails();
	}
}
