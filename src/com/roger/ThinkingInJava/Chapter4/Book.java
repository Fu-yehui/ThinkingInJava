package com.roger.ThinkingInJava.Chapter4;

public class Book {
	public boolean checkOut=false;
	public int id;
	
	public Book(int id,boolean checkOut) {
		this.checkOut=checkOut;
		this.id=id;
	}
	void checkIn() {
		checkOut=false;
	}
	
	protected void finalize() throws Throwable {
		System.out.println(this.id+" in finalize");
		if(checkOut) {
			System.out.println("Error: checked out");
			super.finalize();
		}
		
	}
	public static void main(String[] args) {
		Book novel=new Book(1,true); //该对象处于（reachable.unfinalized)状态
		//Proper cleanup
		novel.checkIn();
		novel=null;  //将指向该对象的对象指引指向null，此时，该对象处于(unreachable,unfinalized)状态
		//Drop the reference.forget to clean up
		new Book(2,true); //该对象初始化时没有对象指向他，所以也是（unreachable,unfinalized)状态
		//Force garBage collection & finalizeation
		System.gc();
		//若JVM检测到处于unfinalized状态的对象变成f-reachable或unreachable，
		//JVM会将其标记为finalizable状态。
		//若对象原处于[unreachable, unfinalized]状态，则同时将其标记为（f-reachable(H)，finalizeable)。(因为将对象finalizable对象标记为finalized时会由某个线程执行该对象的finalize方法，所以致使其变成reachable。）
		//在某个时刻，JVM取出某个finalizable对象，将其标记为finalized并在某个线程中执行其finalize方法。
		//进行调用finalize()方法，此时，对象变成(unreachable,finalized)状态，
		//若JVM检测到finalized状态的对象变成unreachable，回收其内存

	}

}
