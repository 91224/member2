package com.example.Member.Controller;

import com.example.Member.repository.MemberRepository;
import com.example.Member.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

    @Autowired
    private MemberService memberService;

    // 메인 페이지 이동
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public void mainPageGET(HttpSession session) {
        logger.info("메인 페이지 진입");

        // 세션에서 로그인 정보를 확인하거나 필요한 경우 처리
        if (session.getAttribute("loggedInMember") == null) {
            // 로그인 정보가 없으면 로그인 페이지로 리다이렉트
            // 예시로 /member/login으로 리다이렉트
            logger.info("로그인 정보 없음");
            return "redirect:/member/main";
        }
    }

    // 회원가입 페이지 이동
    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public void joinGET() {
        logger.info("회원가입 페이지 진입");
    }

    // 회원가입
    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public String joinPOST(MemberRepository member) throws Exception {
        logger.info("join 진입");

        // 회원가입 서비스 실행
        memberService.memberJoin(member);

        logger.info("join Service 성공");

        return "redirect:/member/main"; // 메인페이지로 돌아감
    }

    // 로그인
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPOST(HttpServletRequest request, MemberRepository member, RedirectAttributes rttr, HttpSession session) throws Exception {
        logger.info("login 메서드 진입");
        logger.info("전달된 데이터 : {}", member);

        // 로그인 서비스 실행
        MemberRepository loggedMember = memberService.memberLogin(member);

        if (loggedMember != null) {
            // 로그인 성공 시 세션에 로그인 정보 저장
            session.setAttribute("loggedInMember", loggedMember);

            return "redirect:/member/main"; // 로그인 성공 후 메인페이지로 리다이렉트
        } else {
            // 로그인 실패 시 처리
            rttr.addFlashAttribute("msg", "로그인 실패");
            return "redirect:/member/login"; // 로그인 실패 시 로그인 페이지로 리다이렉트
        }
    }

    // 로그아웃
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public String logoutPOST(HttpSession session) {
        logger.info("logout 메서드 진입");

        // 세션에서 로그인 정보 삭제
        session.removeAttribute("loggedInMember");
        session.invalidate(); // 세션 무효화

        return "redirect:/member/login"; // 로그아웃 후 로그인 페이지로 리다이렉트
    }
}
