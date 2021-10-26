package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.oneway_1tom.Vaccines;


public interface VaccinesRepository extends JpaRepository<Vaccines, Long> {

}
