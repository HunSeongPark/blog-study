package com.example.querydslinemptylist.domain;

import java.util.List;

public interface MemberRepositoryCustom {

    List<String> selectMemberNameList(List<Long> memberIdList);
}
