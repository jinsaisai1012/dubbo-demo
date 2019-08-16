package com.lanou3g.dubbo.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderLauncher {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ctx.start();

		System.out.println("Provider启动完成");

		// 阻止程序退出， 直到输入一个任意字符后才退出
		System.in.read();

	}
}
