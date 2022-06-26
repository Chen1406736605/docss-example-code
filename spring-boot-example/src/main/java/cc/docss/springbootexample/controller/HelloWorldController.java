package cc.docss.springbootexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhcChen
 * @since 2022-06-26 08:39:00
 */
@RestController
public class HelloWorldController {

    @GetMapping
    public String hw() {
        return "hello world!";
    }

}
