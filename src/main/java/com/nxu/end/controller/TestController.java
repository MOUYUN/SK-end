package com.nxu.end.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/get")
    @CrossOrigin
    public String get(){
        return "get";
    }

    @PatchMapping("/post")
    @CrossOrigin
    public String post(){
        return "post";
    }

}
