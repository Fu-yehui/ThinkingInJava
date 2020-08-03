package com.roger.ThinkingInJava.Access;

public class Game {
	Game(int i){
		System.out.println("i: "+i+ " Game constructor");
	}
	
	public static void main(String[] args) {
		Chess chess=new Chess(33);
	}

}
class BoardGame extends Game{
	BoardGame(int i){
		super(11);

			System.out.println("i: "+i+ " BoardGame constructor");
		
	}
	
}
	class Chess extends BoardGame{
		Chess(int i){
			super(22);
			System.out.println("i: "+i+ " Chess constructor");
		}
		
	
	}

