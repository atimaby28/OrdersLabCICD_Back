package org.example.groworders.domain.test;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController {
    // stable pod
    @GetMapping("/test")
    public String stable() {
        return "stable";
    }

    // canary pod
    @GetMapping("/test")
    public String canary() {
        return "canary";
    }
}
