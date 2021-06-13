package kr.co.memorytime.memorytime.domain.user.service;

import kr.co.memorytime.memorytime.domain.user.model.entity.User;
import kr.co.memorytime.memorytime.domain.user.model.enums.UserRole;
import kr.co.memorytime.memorytime.domain.user.model.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    //회원가입
    @Override
    public void register(String UserId, String password, String email) {
        System.out.println("UserId = " + UserId);
        User user = User.builder()
                .username(UserId)
                .password(password)
                .role(UserRole.USER)
                .email(email)
                .build();
        userRepository.save(user);
    }

    //로그인
    @Override
    public void login(String id, String password) {

    }
}
