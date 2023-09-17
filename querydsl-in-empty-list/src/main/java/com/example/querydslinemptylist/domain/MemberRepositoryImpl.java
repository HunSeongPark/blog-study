package com.example.querydslinemptylist.domain;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.querydslinemptylist.domain.QMember.member;

@Repository
public class MemberRepositoryImpl implements MemberRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public MemberRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<String> selectMemberNameList(List<Long> memberIdList) {
        return queryFactory
                .select(member.name)
                .from(member)
                .where(member.id.in(memberIdList)).fetch();
    }
}
