package com.example.auth_service.user.port;

import com.example.auth_service.user.models.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserPort extends CrudRepository<UserEntity, String> {
    UserEntity save(UserEntity user);
    Optional<UserEntity> findByUsername(String username);
}
