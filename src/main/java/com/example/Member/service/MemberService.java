package com.example.Member.service;

import com.example.Member.repository.MemberRepository;

public interface MemberService {
    //회원가입
    public void memberJoin(MemberRepository member) throws Exception;

    //로그인
    public MemberRepository memberLogin(MemberRepository member) throws Exception;
}