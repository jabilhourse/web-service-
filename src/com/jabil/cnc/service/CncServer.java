package com.jabil.cnc.service;

import javax.xml.ws.Endpoint;


public class CncServer {
	public static void main(String[] args) {
		String address="http://localhost:50249/CNCService";
		CncServiceImpl impl = new CncServiceImpl();
		System.out.println("-----测试开始----");
		Endpoint.publish(address,impl);
		System.out.println("-----测试结束----");
	}
}
