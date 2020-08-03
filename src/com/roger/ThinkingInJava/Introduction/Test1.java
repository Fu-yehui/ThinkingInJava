package com.roger.ThinkingInJava.Chanpter1;

/**
 * Java会将没有进行初始化的基础类型的成员变量赋予 默认值
 * 但是 如果是非类的成员变量则不会进行默认赋值
 * 
 * @author roger
 *
 */
public class Test1 {
	public static int defaultIntValue;
	public static char defaultCharValue;
	public static void main(String[] args) {
		//Java不会赋予默认值
		int intValue;
		char charValue;
		System.out.println("int: "+Test1.defaultIntValue);
		System.out.println("char: "+Test1.defaultCharValue);
		System.out.println("-----------------------------");
		Test1 t1=new Test1();
		Test1 t2=new Test1();
		t1.defaultIntValue=1;
		t1.defaultCharValue='a';
		
		System.out.println("------------------------------");
		System.out.println("int: "+t1.defaultIntValue);
		System.out.println("char: "+t1.defaultCharValue);
		System.out.println("int: "+t2.defaultIntValue);
		System.out.println("char: "+t2.defaultCharValue);
		System.out.println("------------------------------");
		t2.defaultIntValue=2;
		t2.defaultCharValue='b';
		
		System.out.println("int: "+t1.defaultIntValue);
		System.out.println("char: "+t1.defaultCharValue);
		System.out.println("int: "+t2.defaultIntValue);
		System.out.println("char: "+t2.defaultCharValue);
		//System.out.println(intValue); 
		
		System.out.println(args[3]);
		System.out.println(args[2]);
		System.out.println(args[1]);
		System.out.println(args[0]);
		

	}

}
