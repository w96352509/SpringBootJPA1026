package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.oneway_1tom.Infect;


public interface InfectRepository extends JpaRepository<Infect, Long> {

}
