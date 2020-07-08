package com.roger.ThinkingInJava.Chapter4;

public class EnumUser {
	public static void s(Money m) {
		switch(m) {
		case ONE_DOLLAR:System.out.println(m.describe);break;
		case FIVE_DOLLAR:System.out.println(m.describe);break;
		case TEN_DOLLAR:System.out.println(m.describe);break;
		default :System.out.println("五十元");break;
		
		}
		}
	public static void main(String[] args) {
		for(Money m:Money.values()) {
			System.out.println(m+" : "+m.ordinal());
			EnumUser.s(m);
		}
	
		
	}

}
