package com.swa.speakeasy.repository;

import com.swa.speakeasy.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
