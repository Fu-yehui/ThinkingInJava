package com.roger.ThinkingInJava.Chapter4;
/**
 * 可变参数
 * @author roger
 *
 */
public class VarArgs {
	/**
	 * 
	 * @param args 参数个数可选，编译器会将接受的任意个数的Object类型的数据填充到Object数组中，获得的依然是数组，但是调用该方法时，参数可以用任意个数的Object数据，也可以用Object[]数组
	 */
	public static void print(Object...args) {
		for(Object o:args) {
			System.out.print(o+" ");
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		VarArgs.print(1,2,3,4,5);
		
		VarArgs.print(new Integer[] {1,2,3,4,5});

		Other.main("fu","ye","hui");
		Other.main(new String[] {"baola","zhangsan","lisi"});
	}

}

 class Other{
	public static void main(String...args) {
		for(String o:args) {
			System.out.print(o+" ");
			
		}
		System.out.println();
	}
		
	}

