package kr.co.memorytime.memorytime.domain.user.controller;

import kr.co.memorytime.memorytime.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value="/user")
@RequiredArgsConstructor
@Controller
public class UserController {

//    private final UserService userService;

    //메인페이지
    @GetMapping(value="/main")
    public String home() {
        return "index";
    }

    //회원가입
    @PostMapping(value="/sign-up")
    
    public String register() {
        System.out.println("true = " + true);
        return "signup";
    }

    //로그인 페이지 이동
    @GetMapping(value="/login")
    public String goLogin() {

        System.out.println(" 왜 글자만 나오니이이이");
        return "login";
    }

//
//    @PostMapping(value="/login")
//    public String login() {
//        return "login";
//    }



}
