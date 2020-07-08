package com.roger.ThinkingInJava.Chapter6;

/**
 * Java实例变量在初始化时的顺序是
 * 
 * 父类的(**初始化代码**) （不是构造器）（xxx—>xxx—>xxx）A—>定义变量时直接赋值 B—>构造函数代码块 C。
 * @author roger
 *
 */
public class C extends A{
	private B b=new B();

	public C() {
		System.out.println("inside C constructor");
	}
	public static void main(String[] args) {
		C c=new C();

	}

}
