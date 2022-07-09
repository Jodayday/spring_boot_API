package com.example.demo.control;


import com.example.demo.dto.PostRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/post")
public class PostApiControl {

    @PostMapping("/test")
    public void test(@RequestBody Map<String, Object> requestData){
        requestData.forEach((key, value) -> {
            System.out.println("key " + key);
            System.out.println("value " + value);
        });
    }
    @PostMapping("/test1")
    public void test1(@RequestBody PostRequest requestData){
        System.out.println(requestData);

    }
}
