package com.example.querydslinemptylist;

import com.example.querydslinemptylist.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public List<String> findMemberNameListByEmptyList() {
        return memberRepository.selectMemberNameList(Collections.emptyList());
    }

    public List<String> findMemberNameListByNull() {
        return memberRepository.selectMemberNameList(null);
    }

    public List<String> findMemberNameListByNullValidation(List<Long> memberIdList) {
        if (memberIdList == null) {
            // Custom Exception Throw 등의 Validation 처리
            // 코드 흐름에 맞춘 validation 처리!
             return Collections.emptyList();
        }
        return memberRepository.selectMemberNameList(memberIdList);
    }
}
