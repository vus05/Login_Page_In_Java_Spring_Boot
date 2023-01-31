package com.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.entity.UserDtls;

public interface UserRepo extends JpaRepository<UserDtls, Integer> {

}
