package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserInfo;
public interface UserRepository extends JpaRepository<UserInfo,Integer>{

}
