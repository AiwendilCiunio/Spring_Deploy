package com.spring_deploy.spring_deploy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class DemoController {

    @GetMapping
    public ResponseEntity<String> getRoot() {
        return ResponseEntity.ok("Hello Digital Ocean!");
    }
}
