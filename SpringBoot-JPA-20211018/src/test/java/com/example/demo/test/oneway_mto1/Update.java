package com.example.demo.test.oneway_mto1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.oneway_mto1.Customer;
import com.example.demo.entity.oneway_mto1.Order;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.OrderRepository;

@SpringBootTest
public class Update {
	@Autowired
	CustomerRepository customerRepository;
    @Autowired
    OrderRepository orderRepository;
    
    @Test
    public void Update() {
    	//假設要更改客戶id=1的客戶年齡
    	Order order = orderRepository.getById(1L);
    	Customer customer = order.getCustomer();
    	customer.setAge(3001);
    	order.setName("AAA1");
    	//進行資料儲存
    	//orderRepository.save(order);
    	//customerRepository.save(customer);
    	//聯集保存
    	orderRepository.save(order);
    	
    }
    
}
