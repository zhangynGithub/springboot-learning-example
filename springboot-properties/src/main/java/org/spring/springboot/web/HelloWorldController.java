package org.spring.springboot.web;

import org.spring.springboot.property.SelfProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot HelloWorld 案例
 *
 * Created by bysocket on 16/4/26.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHello() {
        return "Hello,World!";
    }


    @RequestMapping("/personal")
    public String personalInfo(){

        SelfProperties self = new SelfProperties();

        return self.toString();

    }

}
