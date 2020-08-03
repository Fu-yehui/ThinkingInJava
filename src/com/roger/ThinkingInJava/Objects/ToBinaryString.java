package com.roger.ThinkingInJava.Objects;

public class ToBinaryString {
	
	public static void main(String[] args) {
		//常量后面的后缀字符标志了他的类型
		int i=0x2f;
		System.out.println(Integer.toBinaryString(i));
		int I=0X2F;
		System.out.println(Integer.toBinaryString(I));
		int a=07;
		System.out.println(Integer.toBinaryString(a));
		long b=13L;
		System.out.println(Long.toBinaryString(b));
		
		//e真正的含义：10 非2.718
		//编译器通常将指数作为double处理，若赋值给float类型 则需要在值后面加上 f
		
		float expFloat=1.39e-28f;//1.39sx10^(-28)   
		double expDouble=34e24;
		System.out.println(expFloat);
		System.out.println(expDouble);

		//将float或者double转化为int类型时，总是对该数字进行 截尾 不进行舍入
		double above=0.7D,below=0.4d;
		float fabove=0.7f,fblow=0.4F;
		System.out.println((int)above);
		System.out.println((int)below);
		System.out.println((int)fabove);
		System.out.println((int)fblow);
		//想要得到舍入的结果，使用java.lang.Math中的round()方法
		
		System.out.println(Math.round(above));
		System.out.println(Math.round(below));
		System.out.println(Math.round(fabove));
		System.out.println(Math.round(fblow));
		System.out.println("---------------------------------");
		byte bb=2;
		bb+=1;
		
		System.out.println(bb);
		if(ToBinaryString.judgeType(bb))System.out.println("int");
		else System.out.println("byte");

		String s1="abc";
		String s2="abc";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		/**java不允许将数字作为boolean使用
		if(3) {
			
		}
		*/
		
	}
 public static boolean judgeType(Object o) {
	 return o instanceof Integer? true:false;
 }
}
