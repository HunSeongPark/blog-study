package com.example.externalserver;

import com.example.externalserver.feign.ApiClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/external")
@RequiredArgsConstructor
@RestController
public class ExternalController {

    private final ApiClient apiClient;

    @GetMapping("/delayed")
    public String delayedWithoutReturn() throws InterruptedException {
        apiClient.delayedWithoutReturn();
        return "Success!";
    }

    @GetMapping("/delayed/return")
    public String delayedWithReturn() throws InterruptedException {
        return apiClient.delayedWithReturn();
    }
}
