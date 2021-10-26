package com.example.demo.test.oneway_mto1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.oneway_mto1.Customer;
import com.example.demo.entity.oneway_mto1.Order;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.OrderRepository;


@SpringBootTest
public class Qusery {
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	OrderRepository orderRepository;

	@Test
	public void qsery() {
       Order order =orderRepository.getById(1L);
       System.out.println(order.getName());
       //改成LAZY後要自行手動查詢
       Customer customer = order.getCustomer();
       System.out.println(customer.getName());
       System.out.println(customer.getId());
	}

}
