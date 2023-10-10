package com.example.externalserver.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "apiClient", url = "http://localhost:8081/api/internal", configuration = FeignConfig.class)
public interface ApiClient {

    @GetMapping("/delayed")
    void delayedWithoutReturn();

    @GetMapping("/delayed/return")
    String delayedWithReturn();
}
