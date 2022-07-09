package com.example.request_response.control;

import com.example.request_response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiControl {

    @GetMapping("/text")
    public String text(@RequestParam String account ){
        return account;
    }
    // req > object mapper > object > method > object > objectmapper > json> response
    // Json
    @PostMapping("/json")
    public User json(@RequestBody User user){
        return user;
    }
    // Response Entity
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(user);
    }

}
