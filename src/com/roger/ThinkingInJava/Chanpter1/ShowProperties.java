package com.roger.ThinkingInJava.Chanpter1;
/**
 * The first Thinking in Java example program
 * 
 * @author roger
 *	@version 4.0
 * @see 相关主题 Java注释
 */
public class ShowProperties {
	public static void main(String[] args) {
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(
				System.getProperty("java.library.path"));
	}
}
