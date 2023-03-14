package com.example.auth_service.user.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_credentials")
@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id;
    @Column(name = "username", length = 30)
    private String username;
    @Column(name = "email", length = 30)
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "secret")
    private String secret;
    @Column(name = "active")
    private boolean active = true;
    @Column(name = "blocked")
    private boolean blocked = false;
}
