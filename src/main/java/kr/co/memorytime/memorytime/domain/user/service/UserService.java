package kr.co.memorytime.memorytime.domain.user.service;

public interface UserService {
    //회원가입
    void register(String id, String password, String email);

    //로그인
    void login(String id, String password);
}
