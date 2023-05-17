package com.example.sbb.example.lecture.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Getter
@Setter
@Entity
public class SiteUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

    @Column(unique = true)
    private String email;
}
