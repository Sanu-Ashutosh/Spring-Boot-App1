package com.nit.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.discovery.DiscoveryClient;

@Component
public class BillingServiceConsumerMS {
	@Autowired
	private DiscoveryClient client;
	
	public String getBillingInfo()
	{
		client.getInstancesById();
	}
}
