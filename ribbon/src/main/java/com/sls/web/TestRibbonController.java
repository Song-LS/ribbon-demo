package com.sls.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author sls
 **/
@RestController
public class TestRibbonController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String test() {
        return restTemplate.getForObject("http://demo/test-ribbon", String.class);
    }
}
