package com.example.demo.test.oneway_1tom;

import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.oneway_1tom.Infect;
import com.example.demo.entity.oneway_1tom.Vaccines;
import com.example.demo.repository.InfectRepository;
import com.example.demo.repository.VaccinesRepository;

@SpringBootTest
public class Qusery {
	@Autowired
	InfectRepository infectRepository;
	@Autowired
	VaccinesRepository vaccinesRepository;
	
	@Test
	public void qusery() {
	Infect infect =infectRepository.findById(1L).get();
	Vaccines vaccines1 =vaccinesRepository.findById(1L).get();
	System.out.println(infect.getName());
	System.out.println(vaccines1.getName());
	Set<Vaccines> vaccines =infect.getVaccines();
	for(Vaccines h:vaccines) {
 	  System.out.println(h.getName());
 	}
	}
}
