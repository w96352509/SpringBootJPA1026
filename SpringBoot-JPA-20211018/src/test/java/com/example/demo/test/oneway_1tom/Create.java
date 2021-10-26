package com.example.demo.test.oneway_1tom;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.oneway_1tom.Infect;
import com.example.demo.entity.oneway_1tom.Vaccines;
import com.example.demo.repository.InfectRepository;
import com.example.demo.repository.VaccinesRepository;

@SpringBootTest
public class Create {
	@Autowired
	InfectRepository infectRepository;
	@Autowired
	VaccinesRepository vaccinesRepository;

	@Test
	public void create() {
       System.out.println("create");
       Infect infect = new Infect();
       infect.setName("COVID-19");
       Vaccines v1=new Vaccines();
       Vaccines v2=new Vaccines();
       Vaccines v3=new Vaccines();
       v1.setName("AZ");
       v2.setName("BNT");
       v3.setName("JP");
       v1.setCount(2);
       v2.setCount(2);
       v3.setCount(2);
       //建立關聯
       infect.getVaccines().add(v1);//得到後加入\
       infect.getVaccines().add(v2);
       infect.getVaccines().add(v3);
       //執行保存
       //vaccinesRepository.save(v1);
       //vaccinesRepository.save(v2);
       //vaccinesRepository.save(v3);
       //infectRepository.save(infect);
       
       //聯集保存
       infectRepository.save(infect);
       
	}
}
