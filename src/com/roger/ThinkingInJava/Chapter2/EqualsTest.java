package com.roger.ThinkingInJava.Chapter2;

public class EqualsTest {

	int value;
	
	@Override
	public boolean equals(Object other) {
		EqualsTest to=(EqualsTest)other;
		if(value==to.value)return true;
		return false;
	}
	public static void main(String[] args) {
		EqualsTest t1=new EqualsTest();
		EqualsTest t2=new EqualsTest();
		t1.value=1;
		t2.value=1;
		
		System.out.println("==: "+(t1==t2));
	//	System.out.println("未覆写equals方法时： "+t1.equals(t2));
		System.out.println("覆写equals方法时： "+t1.equals(t2));


	}

}
