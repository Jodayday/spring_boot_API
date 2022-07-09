package com.example.demo.control;


import com.example.demo.dto.PutRequest;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/put")
public class PutApiControl {

    @PutMapping("/test/{userId}")
    public PutRequest put(@RequestBody PutRequest request, @PathVariable Long userId){
        System.out.println(request);
        System.out.println(userId);
        return request;
    }
}
