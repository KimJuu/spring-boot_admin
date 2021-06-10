package com.example.springboot_admin.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") //localhost:8080/api
public class getController {
    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")
    public String getRequest(){
        return "Hi getMethod";
    }

    @GetMapping("/getParameter") //localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam String password){
        System.out.println("id : " + id);
        System.out.println("password : " + password);

        return id+password;
    }
}