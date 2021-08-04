package com.example.rebase.first;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("first")
@RestController
public class FirstController {

    private static final String text = "Hello, First!";

    @GetMapping
    public String first(){
        log.info(text);
        return text;
    }
}
