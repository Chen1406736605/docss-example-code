package com.example.springbootdockerexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhcChen
 * @since 2022-06-27 09:43:06
 */
@RestController
public class DockerController {

    @GetMapping
    public String docker() {
        return "hello docker!";
    }

}
