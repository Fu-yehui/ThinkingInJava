package com.roger.ThinkingInJava.Chapter3;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		int i=1;
		while(i<=100) {
			System.out.print(" "+i++);
		}
		
		System.out.println();
		
		
 int j=1;
 do {
		System.out.print(" "+j++);
 }while(j<=100);
 
	System.out.println();
	Random random=new Random(47);
	float[] f=new float[100];
 for(int a=1;a<=100;a++) {
		System.out.print(" "+a);
		f[a-1]=random.nextFloat();
		
 }
 System.out.println();
 System.out.println("---------------------");
 for(float ff:f) {
	 System.out.print(ff+" ");
	
 }
 System.out.println();
 String test="asjfgfjasjfasfasd";
 char[] c=test.toCharArray();
 for(char cc:c) {
	 System.out.print(cc+" ");
 }
		 
 System.out.println();
 
 for(int b=0;b<25;b++) {
 int data= random.nextInt();
 if(data<47)System.out.println("<");
 else if(data==47)System.out.println("=");
 else System.out.println(">");
 }
 
 for(int ii=1,jj=1;ii<5&&jj<10;ii++,jj=ii*2) {
	 System.out.println("ii: "+ii+" jj: "+jj);
 }
 
 
	}

}
