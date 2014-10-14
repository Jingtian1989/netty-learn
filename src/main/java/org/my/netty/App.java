package org.my.netty;

import org.my.netty.client.HelloClient;
import org.my.netty.server.HelloServer;

public class App {

	public static void main(String[] args) {
		new Thread(new HelloServer()).start();
		new Thread(new HelloClient()).start();
		Thread.currentThread().yield();
	}
}
