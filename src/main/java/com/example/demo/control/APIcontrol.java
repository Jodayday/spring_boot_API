package com.example.demo.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //REST API 처리하는 zmffotm
@RequestMapping("/api") // url를 지정해주는 Annotation
public class APIcontrol {

    @GetMapping("/hello") //http://localhost:9090/api/hello
    public String hello(){
        return "hello spring boot!";
    }

}
