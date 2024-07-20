package com.example.Member.service;

import com.example.Member.mapper.MemberMapper;
import com.example.Member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    MemberMapper membermapper;

    @Override
    public void memberJoin(MemberRepository member) throws Exception{
        membermapper.memberJoin(member);
    }
}
