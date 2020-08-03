package com.roger.ThinkingInJava.Chapter3;

public class VampireNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1001;i<10000;i++) {
		
			int a=i/1000;
			int b=i/100-a*10;
			int c=i/10-b*10-a*100;
			int d=i-c*10-b*100-a*1000;
		
		
			int r1=(a*10+b)*(c*10+d);  //12 34    
			int r2=(a*10+b)*(d*10+c); // 12 43 
			int r3=(b*10+a)*(d*10+c);  //	21 43  
			int r4=(b*10+a)*(c*10+d);  //   21 34
			int r5=(a*10+c)*(b*10+d);  //13 24 
			int r6=(a*10+c)*(d*10+b);  // 13 42
			int r7=(c*10+a)*(d*10+b);              //31 42
			int r8=(c*10+a)*(b*10+d);     //  31 24
			int r9=(a*10+d)*(b*10+c);        //14  23
			int r10=(a*10+d)*(c*10+b);    //14   32
			int r11=(d*10+a)*(c*10+b);  //41 32 
			int r12=(d*10+a)*(b*10+c);  //41 23
			
			
		if(r1==i||r2==i||r3==i||r4==i||r5==i||r6==i||r7==i||r8==i||r9==i||r10==i||r11==i||r12==i)
			System.out.println(i+" is VampireNumbers");
			
		}
	}

}
/**
1234	
	

	
	



	*/