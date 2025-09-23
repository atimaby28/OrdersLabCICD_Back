package org.example.groworders.domain.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/test")
public class BlueGreenController {

    @GetMapping("/bg")
    public Map<String, Object> getVersionInfo() {
        Map<String, Object> response = new HashMap<>();
        response.put("version:", "green"); // Canary / Stable 구분
        response.put("timestamp", LocalDateTime.now().toString());
        return response;
    }
}