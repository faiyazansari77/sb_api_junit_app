package com.g77tech.service;

import org.springframework.stereotype.Service;

@Service
public class MsgService {

	public String getWelcomeMsg() {
		String msg = "Welcome to g77tech";
		return msg;
	}
}
