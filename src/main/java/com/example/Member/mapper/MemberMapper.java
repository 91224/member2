package com.example.Member.mapper;

import com.example.Member.repository.MemberRepository;

public interface MemberMapper {

    /*회원가입*/
    public void memberJoin(MemberRepository member);

    /*아이디 중복검사*/
    public int idCheck(String memberId);

    /*로그인*/
    public MemberRepository memberLogin(MemberRepository member);
}
