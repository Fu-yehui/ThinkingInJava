package com.roger.ThinkingInJava.Chapter9;

public class Games {
    public static void playGame(GameFactory factory) {
        Game game = factory.getGame();
        game.play();
    }

    public static void main(String[] args) {
     playGame(new DiceFactory());
     playGame(new CoinFactory());


        /**
         * 将创建game对象和调用play()方法等重复的代码放入playGame()方法中，提高代码的复用率
         *
         */
     Game coin=new Coin();
     coin.play();
     Game dice=new Dice();
     dice.play();
     }

}
interface Game {
    public void play();
}

interface GameFactory {
    public Game getGame();
}

class Coin implements Game {
    @Override
    public void play() {
        System.out.println("toss a coin");
    }
}

class Dice implements Game {
    @Override
    public void play() {
        System.out.println("a fling of the dice");
    }
}

class CoinFactory implements GameFactory{
    @Override
    public Game getGame(){
        return new Coin();
    }
}


class DiceFactory implements GameFactory{
    @Override
    public Game getGame(){
        return new Dice();
    }
}