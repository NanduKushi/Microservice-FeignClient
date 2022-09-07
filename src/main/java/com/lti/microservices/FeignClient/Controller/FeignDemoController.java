package com.lti.microservices.FeignClient.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.microservices.FeignClient.utils.FeignServiceUtil;

@RestController
@RequestMapping("/demo")
public class FeignDemoController {
@Autowired
private FeignServiceUtil feignServiceUtil;

@GetMapping("/user-name")
public String getName() {
	return feignServiceUtil.getName();
}
@GetMapping("/user-address")
public String getAddress() {
	return feignServiceUtil.getAddress();
}
@GetMapping("/user-status")
public String getStatus() {
	return feignServiceUtil.getStatus();
}
}
