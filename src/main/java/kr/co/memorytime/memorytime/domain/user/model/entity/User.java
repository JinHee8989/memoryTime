package kr.co.memorytime.memorytime.domain.user.model.entity;

import kr.co.memorytime.memorytime.domain.user.model.enums.UserRole;
import kr.co.memorytime.memorytime.domain.user.model.repository.UserRepository;
import lombok.*;

import javax.persistence.*;

@Getter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class User {

    @Id @GeneratedValue
    private Long id;

    private String username;

    private String password;

    private String email;

    @Enumerated(EnumType.STRING)
    private UserRole role;
}


