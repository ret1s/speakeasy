package com.swa.speakeasy.repository;

import com.swa.speakeasy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
