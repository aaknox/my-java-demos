package com.revature.services;

import org.springframework.stereotype.Service;

@Service
public class MotivationServiceImpl  implements MotivationService {

	@Override
	public String getMotivation() {
		return "Don't quit. Suffer now and live the rest of your life like a champion.";
	}
	
	public void myInit() {
		System.out.println("MotivationServiceImpl.myInit() - init-method");
	}
	
	public void myDestroy() {
		System.out.println("MotivationServiceImpl.myDestroy() - destroy-method");
	}

}
