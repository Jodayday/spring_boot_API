package com.example.request_response;

import com.example.request_response.dto.TextUser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RequestResponseApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        // Object Mapper란?
        // Text Json > Object
        // Object > Text Json

        var om = new ObjectMapper();

        // object > text
        // get method 사용됨
        var user = new TextUser("stat",14,"1010-15");
        var text = om.writeValueAsString(user);
        System.out.println(text);

        // text > object
        // 디폴트 생성자가 피료하다.
        var objectUser = om.readValue(text,TextUser.class);
        System.out.println(objectUser);
    }

}
