package com.roger.ThinkingInJava.Chapter6;

public class Bath {

	private  Soap soap;
	
	public Bath() {
		System.out.println("inside Bath constructor");
	}
	public Soap getSoap() {
		return soap;
	}
	public String toString() {
		if(soap==null) {	//惰性初始化   Delayed initialization 
			soap=new Soap();
		}
		return "soap: "+soap.toString();
	}
	public static void main(String[] args) {
		Bath bath=new Bath();
		System.out.println(bath.soap);  //此时，soap对象还没有实例化
		System.out.println(bath.toString());  //惰性初始化
		System.out.println(bath.soap);  

	}

}

