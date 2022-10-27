package com.gomez.microservices.limitservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gomez.microservices.limitservice.bean.LimitConfiguration; 
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
}
