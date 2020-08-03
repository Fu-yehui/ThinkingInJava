package com.roger.ThinkingInJava.Chapter3;
/*
 * continue 停止当前迭代，退回循环起始处，开始下一次迭代
 * 	break 跳出当前循环
 *  continue label 跳到标签的位置，并且重新进入标签后的循环
 *  break label 跳出标签所指的循环
 */
public class Label {

	public static void main(String[] args) {
		int i=0;
		outer:	   //label
		for(;true;) {//infinite loop
			inner:	   //label
			for(;i<10;i++) {
				System.out.println("i= "+i);
				if(i==2) {
					System.out.println("continue");
					continue;
				}
				if(i==3) {
					System.out.println("break");
					i++; 
					break;
				}
				
				if(i==7) {
					System.out.println("continue outer");
					i++;
					continue outer;
				}
				
				if(i==8) {
					System.out.println("break outer");
					break outer;
				}
				
				for(int k=0;k<5;k++) {
					if(k==3) {
						System.out.println("continue inner");
						continue inner;
					}
				}
					
				
			}
			
		}
	}

}
