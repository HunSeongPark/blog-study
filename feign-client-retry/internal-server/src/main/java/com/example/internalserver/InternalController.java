package com.example.internalserver;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/internal")
@RestController
public class InternalController {

    private final InternalService internalService;

    @GetMapping("/delayed")
    public String delayedWithoutReturn() throws InterruptedException {
        internalService.delayedLogicWithoutReturn();
        return "Success";
    }

    @GetMapping("/delayed/return")
    public String delayedWithReturn() throws InterruptedException {
        return internalService.delayedLogicWithReturn();
    }
}
