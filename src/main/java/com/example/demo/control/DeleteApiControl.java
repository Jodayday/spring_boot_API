package com.example.demo.control;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/delete")
public class DeleteApiControl {

    @DeleteMapping("/test/{userId}")
    public void test(@PathVariable String userId, @RequestParam(required = false) String account){
        System.out.println(userId);
        System.out.println(account);


    }

}
