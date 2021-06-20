package kr.co.memorytime.memorytime.domain.user.model.repository;

import kr.co.memorytime.memorytime.domain.user.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsernameAndPassword(String id, String password);
}
