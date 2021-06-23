package com.awspractice.springboot.web;

import com.awspractice.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // "/hello"로 get 요청 들어오면 hello 리턴
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    // "/hello/dto"로 get 요청 들어오면 HelloResponseDto 리턴
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }
}
