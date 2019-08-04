package com.sravan.jvm;

public class GCDemo {
	
	static int [] iArray = new int[4*1024*1024];// 16 MB approximatley

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// -Xms2m -Xmx26m -XX:+PrintGCDetails -XX:+UseSerialGC
		// -Xms2m -Xmx26m -XX:+PrintGCDetails -XX:+UseSerialGC -XX:+MaxNewSize=1m
		
		

	}
	
	

}
