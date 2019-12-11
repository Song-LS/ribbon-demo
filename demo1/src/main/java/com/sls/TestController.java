package com.sls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sls
 **/
@RestController
public class TestController {

    @GetMapping("/test-ribbon")
    public String ribbon() {
        System.out.println("有新的请求");
        return "success";
    }
}
