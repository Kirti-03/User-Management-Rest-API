package com.example.User_management.repository;

import com.example.User_management.model.user_management_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface user_management_repository extends JpaRepository<user_management_model, Integer>{
}
