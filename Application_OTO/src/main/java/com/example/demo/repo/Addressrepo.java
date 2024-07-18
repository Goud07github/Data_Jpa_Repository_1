package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Address;

public interface Addressrepo extends JpaRepository <Address , Integer> {

}
