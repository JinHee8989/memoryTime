package kr.co.memorytime.memorytime.domain.user.controller;

import kr.co.memorytime.memorytime.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value="/user")
@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

    //메인페이지
    @GetMapping(value="/main")
    public String home() {
        return "index";
    }

    //회원가입
    @GetMapping(value="/sign-up")
    public String goRegister() {
        return "signup";
    }

    @PostMapping(value="/register")
    public String register(String id, String password, String email) {
        //회원가입 진행
        userService.register(id,password,email);
        return "redirect:/";
    }

    //로그인
    @GetMapping(value="/login")
    public String goLogin(String id, String password) {

        userService.login(id,password);
        return "login";
    }

    @PostMapping(value="/login")
    public String login() {
        return "login";
    }



}
