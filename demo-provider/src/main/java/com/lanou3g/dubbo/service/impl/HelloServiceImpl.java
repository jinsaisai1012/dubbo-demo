package com.lanou3g.dubbo.service.impl;

import com.lanou3g.dubbo.api.IHello;


public class HelloServiceImpl implements IHello {
	public String sayHello() {
		System.out.println("Hello Dubbo");
		return "Hello Dubbo";
	}

	public String sayHello(String name) {
		String msg = "Hello, " + name;
		System.out.println(msg);
		return msg;
	}
}
