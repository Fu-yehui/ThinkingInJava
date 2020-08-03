package com.roger.ThinkingInJava.Chapter4;

import java.util.Random;

public class Demo {
	public static String red="red";
	public static String black;
	
	static {
		System.out.println("inside static block ,before black "+"red: "+red+" black: "+black);
		black="black";
		System.out.println("inside static block "+"red: "+red+" black: "+black);
	}
	
	public static void Print() {
		System.out.println("red: "+red+" black: "+black);
		
	}
	public static void main(String[] args) {
		Demo.Print();//在class文件进行首次加载时，接着会进行初始化static成员变量的值，和执行static block里的代码
		System.out.println("print red&black value second");
		Demo.Print(); //此时，不会再次初始化static成员变量的值，和执行static block里的代码
		
		int[] a=new int[new Random(47).nextInt(20)];
		System.out.println(a[0]);  //默认值 
		
		Integer[] A=new Integer[new Random(47).nextInt(20)];
		System.out.println(A[0]);
		
		Other.main(new String[] {"fiddle","de","dum"});
    //Other.main(    {"fiddle","de","dum"}       );  不允许
		
	}

}
