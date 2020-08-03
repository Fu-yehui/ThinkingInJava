package com.roger.ThinkingInJava.Chapter10;


/**
 * 修改chapter9中的Games类
 * 在Game类中增加静态字段 使用匿名内部类代替GameFactory的具体实现
 * 使得Game类的构造器权限为private,
 * 只能通过静态工厂得到实例化
 *
 *
 */
public class Games {
    public static void playGame(GameFactory factory) {
        Game game = factory.getGame();
        game.play();
    }

    public static void main(String[] args) {
        playGame(Coin.factory);
        playGame(Dice.factory);


        /**
         * 将创建game对象和调用play()方法等重复的代码放入playGame()方法中，提高代码的复用率
         *
         */
//        Game coin=new Coin();
//        coin.play();
//        Game dice=new Dice();
//        dice.play();
    }

}
interface Game {
    public void play();
}

interface GameFactory {
    public Game getGame();
}

class Coin implements Game {
    private Coin(){

    }

    @Override
    public void play() {
        System.out.println("toss a coin");
    }

    /**
     * 匿名内部类实现工厂对象，能访问外部类的private构造器
     */
    public static GameFactory factory=new GameFactory() {
        @Override
        public Game getGame() {
            return new Coin();
        }
    };

}

class Dice implements Game {
    private Dice(){

    }
    @Override
    public void play() {
        System.out.println("a fling of the dice");
    }

    public static GameFactory factory=new GameFactory() {
        @Override
        public Game getGame() {
            return new Dice();
        }
    };
}

//class CoinFactory implements GameFactory {
//    @Override
//    public Game getGame(){
//        return new Coin();
//    }
//
//}
//
//
//class DiceFactory implements GameFactory {
//    @Override
//    public Game getGame(){
//        return new Dice();
//    }
//}