package com.tcs.demo.controller;

import com.tcs.demo.model.Info;
import com.tcs.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/demo/")
@RestController
public class DemoController {

    private final DemoService demoService;

    @GetMapping("getInfo/{id}")
    public ResponseEntity<Info> getInfo(@PathVariable("id") String id) {
        return ResponseEntity.ok(demoService.fetchInfo(id));
    }
}
