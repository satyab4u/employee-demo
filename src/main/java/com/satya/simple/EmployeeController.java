package com.satya.simple;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Satya on 10/17/18.
 */
@RestController
public class EmployeeController {
    @RequestMapping("/home")
    public String welcome(){
        return "Welcome to PCF Demo";
    }
}
