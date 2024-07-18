package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Detail;

public interface DetailRepo extends JpaRepository<Detail,Integer>{

}
