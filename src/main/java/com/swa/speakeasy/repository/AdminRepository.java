package com.swa.speakeasy.repository;

import com.swa.speakeasy.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
