package com.roger.ThinkingInJava.Access;

/**
 * 在代理类中创建某功能的类，调用类的一些方法以获得该类的部分特性。
 * @author roger
 *
 */
public class Proxy {
	private Cleanser cleanser=new Cleanser();
	private String name;
	public Proxy(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void append(String a) {
		cleanser.append(a);
	}
	public void dilute() {
		cleanser.append("dilute()");
	}
	public void apply() {
		cleanser.append("apply()");
	}
	public void scrub() {
		cleanser.append("scrub()");
	}
	public String toString() {
		return name+" "+cleanser.toString();
	}
	
	

}


class  Cleanser{
	private String s="Cleanser";
	public void append(String a) {
		s+=a;
	}
	public void dilute() {
		append("dilute()");
	}
	public void apply() {
		append("apply()");
	}
	public void scrub() {
		append("scrub()");
	}
	public String toString() {
		return s;
	}
	
}