package com.harsha.consumefarmerinfo.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {

		SimpleClientHttpRequestFactory simpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory();
		simpleClientHttpRequestFactory.setConnectTimeout(20000);
		simpleClientHttpRequestFactory.setReadTimeout(50000);
		return new RestTemplate(simpleClientHttpRequestFactory);
	}

}
