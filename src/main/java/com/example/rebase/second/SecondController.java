package com.example.rebase.second;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("second")
@RestController
public class SecondController {

    private static final String text = "Hello, Second";

    @GetMapping
    public String second(){
        log.info(text);
        return text;
    }
}
