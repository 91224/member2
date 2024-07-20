package com.example.Member.repository;

public class MemberRepository {
    //회워ID
    private String memberId;
    //회원비밀번호
    private String memberPw;
    //회원이름
    private String memberName;
    //회원이메일
    private String memberMail;
    //회원우편번호
    private String memberAddr1;
    //회원주소
    private String memberAddr2;
    //회원상세주소
    private String memberAddr3;
    //관리자(회원0 관리자1)
    private int adminCk;
    //등록일자
    private int regDate;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPw() {
        return memberPw;
    }

    public void setMemberPw(String memberPw) {
        this.memberPw = memberPw;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberMail() {
        return memberMail;
    }

    public void setMemberMail(String memberMail) {
        this.memberMail = memberMail;
    }

    public String getMemberAddr1() {
        return memberAddr1;
    }

    public void setMemberAddr1(String memberAddr1) {
        this.memberAddr1 = memberAddr1;
    }

    public String getMemberAddr2() {
        return memberAddr2;
    }

    public void setMemberAddr2(String memberAddr2) {
        this.memberAddr2 = memberAddr2;
    }

    public String getMemberAddr3() {
        return memberAddr3;
    }

    public void setMemberAddr3(String memberAddr3) {
        this.memberAddr3 = memberAddr3;
    }

    public int getAdminCk() {
        return adminCk;
    }

    public void setAdminCk(int adminCk) {
        this.adminCk = adminCk;
    }

    public int getRegDate() {
        return regDate;
    }

    public void setRegDate(int regDate) {
        this.regDate = regDate;
    }

}
