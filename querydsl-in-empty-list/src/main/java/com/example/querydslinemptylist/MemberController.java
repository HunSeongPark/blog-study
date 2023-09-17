package com.example.querydslinemptylist;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/members/empty")
    public List<String> getMemberNameListByEmptyList() {
        return memberService.findMemberNameListByEmptyList();
    }

    @GetMapping("/members/null")
    public List<String> getMemberNameListByNull() {
        return memberService.findMemberNameListByNull();
    }
}
