package com.xia.endpoints;

import javax.xml.ws.Endpoint;

import com.xia.services.QueryInfoImpl;
import com.xia.services.VerifyInterfaceImpl;
public class Publisher1 extends Thread{
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:12345/verify",new VerifyInterfaceImpl());
		//Endpoint.publish("http://127.0.0.1:12345/queryInfo",new QueryInfoImpl());
	}
	
}
