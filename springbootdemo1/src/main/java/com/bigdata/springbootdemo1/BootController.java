package com.bigdata.springbootdemo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2018/10/24 11:43
 * @description
 */
@RestController
@RequestMapping("/boot")
public class BootController {
    @RequestMapping("test")
    public String test(){
        return "test";
    }
}
