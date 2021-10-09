package com.harsha.consumefarmerinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FarmerInfoController {
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/save")
	public ResponseEntity<FarmerInfoResponse> getInfo() {
		String url = "http://FARMERINFO/FarmerInfo/SaveFarmerInfo";

		FarmerInfoRequest req = new FarmerInfoRequest();
		req.setAddress("hyd");
		req.setAge("32");
		req.setName("ramesh");
		req.setPhoneNumber("123456");
		req.setState("TS");
		HttpEntity<FarmerInfoRequest> he = new HttpEntity<>(req);

		ResponseEntity<FarmerInfoResponse> re = restTemplate.exchange(url, HttpMethod.POST, he,
				FarmerInfoResponse.class);

		return re;

	}

}
