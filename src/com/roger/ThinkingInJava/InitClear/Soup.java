package com.roger.ThinkingInJava.Chapter5;

public class Soup {
	private static Soup soup=new Soup();
	
	private Soup() {
		
	}
	public static Soup getInstance() {
		return soup;
	}
}
