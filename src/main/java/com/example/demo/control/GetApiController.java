package com.example.demo.control;

import com.example.demo.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")
    public String getHello(){
        return "get Hello";
    }
    @RequestMapping(path="/hi",method = RequestMethod.GET)
    public String hi(){
        return "hi";
    }

    @GetMapping("/pathvariable/{name}")
    public String pathVariable(@PathVariable String name){
        System.out.println("PathVariable : "+name);
        return name;
    }
    @GetMapping("/pathvariable1/{name1}")
    public String pathVariable1(@PathVariable(name = "name1") String pathName){
        System.out.println("PathVariable : "+pathName);
        return pathName;
    }
    @GetMapping("/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

            sb.append(entry.getKey()+"="+entry.getValue()+"\n");

        });
        return sb.toString();
    }

    @GetMapping("/query-param1")
    public String queryParams(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        return name + email + age;
    }

    @GetMapping("/query-param2")
    public String queryParams2(UserRequest userRequest){
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());
        return userRequest.toString();
    }


}
