package com.roger.ThinkingInJava.Chapter4;

public enum Money {
	ONE_DOLLAR(1,"一元"),FIVE_DOLLAR(5,"五元"),TEN_DOLLAR(10,"十元"),FIFTY_DOLLAR(50,"五十元");
	
	public int i;
	public String describe;
	Money(int i,String describe) {
		this.i=i;
		this.describe=describe;
	}
	
	
}
