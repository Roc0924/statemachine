package com.example.demo;

import com.example.demo.statemachine.OrderStateMachine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatemachineSpringBootApplication {


	@Autowired
	OrderStateMachine orderStateMachine;

	public static void main(String[] args) {
		SpringApplication.run(StatemachineSpringBootApplication.class, args);
	}
}
