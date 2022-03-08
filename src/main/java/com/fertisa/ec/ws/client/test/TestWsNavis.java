package com.fertisa.ec.ws.client.test;

import com.fertisa.ec.ws.client.generated.FindAllVisitRequest;
import com.fertisa.ec.ws.client.generated.FindAllVisitResponse;
import com.fertisa.ec.ws.client.generated.VisitDetails;
import com.fertisa.ec.ws.client.generated.VisitPort;
import com.fertisa.ec.ws.client.generated.VisitPortService;

public class TestWsNavis {
 
	
	public static void main(String[] args) {
		FindAllVisitRequest request = new FindAllVisitRequest();
		FindAllVisitResponse response = new FindAllVisitResponse();
		
		VisitPortService service = new VisitPortService();
		VisitPort visitService = service.getVisitPortSoap11();
		
		
		response = visitService.findAllVisit(request);
		
		for (VisitDetails rs : response.getVisitDetails()) {
			System.out.println(rs.getDriver().getDriverName() +"-"+rs.getCargo().getType());
		}
		
		

	}

}
