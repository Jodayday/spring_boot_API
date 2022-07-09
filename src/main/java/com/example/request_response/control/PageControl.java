package com.example.request_response.control;

import com.example.request_response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageControl {

    @RequestMapping("/main")
    public String main(){
        return "index/main.html";
        //String 이면 해당 html파일을 찾아간다.
    }

    // ResponseEntity
    @ResponseBody //json 객체로 전달
    @GetMapping("/user")
    public User user(){
        var user = new User();
        user.setName("이름");
        user.setAge(10);
        user.setAddress("전남");
        return user;
    }
}
