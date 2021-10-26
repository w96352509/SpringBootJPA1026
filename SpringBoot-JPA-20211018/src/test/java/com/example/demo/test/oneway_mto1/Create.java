package com.example.demo.test.oneway_mto1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.oneway_mto1.Customer;
import com.example.demo.entity.oneway_mto1.Order;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.OrderRepository;

@SpringBootTest
public class Create {
    @Autowired
	CustomerRepository customerRepository;
    @Autowired
    OrderRepository orderRepository;
	
	@Test
	public void create(){
		System.out.println("create");
		Order o1 = new Order();
		Order o2 = new Order();
		o1.setName("A-1");
		o2.setName("B-2");
		Customer customer = new Customer();
		customer.setName("John");
		customer.setAge(20);
		//設置關聯性
		o1.setCustomer(customer);
		o2.setCustomer(customer);
		//保存(要保存綁定方)
		customerRepository.save(customer);
		orderRepository.save(o1);
		orderRepository.save(o2);
		
	}
	
}
