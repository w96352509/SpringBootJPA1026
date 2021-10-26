package com.example.demo.test.oneway_1tom;

import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.oneway_1tom.Infect;
import com.example.demo.entity.oneway_1tom.Vaccines;
import com.example.demo.repository.InfectRepository;
import com.example.demo.repository.VaccinesRepository;

@SpringBootTest
public class Update {
	@Autowired
	InfectRepository infectRepository;
	@Autowired
	VaccinesRepository vaccinesRepository;

	@Test
	public void Update() {
       Infect infect = infectRepository.getById(1L);
       infect.setName("武漢肺炎");
       Set<Vaccines> vaccines = infect.getVaccines();
       for(Vaccines h:vaccines) {
    	  //一次新全部
    	}
       infectRepository.save(infect);
	}
}
