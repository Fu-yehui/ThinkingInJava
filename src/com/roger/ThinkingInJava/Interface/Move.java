package com.roger.ThinkingInJava.Chapter9;

public class Move {
    public static void cycleMove(CycleFactory factory) {
        Cycle cycle = factory.getCycle();
        cycle.move();
    }

    public static void main(String[] args) {
        cycleMove(new UnicycleFactory());
        cycleMove(new BicycleFactory());
        cycleMove(new TricycleFactory());

    }

}
    interface Cycle {
        public void move();
    }

    interface CycleFactory {
        public Cycle getCycle();
    }

     class Unicycle implements Cycle {
        @Override
        public void move() {
            System.out.println("Unicycle move");
        }
    }

    class Bicycle implements Cycle {
        @Override
        public void move() {
            System.out.println("Bicycle move");
        }
    }

    class Tricycle implements Cycle {
        @Override
        public void move() {
            System.out.println("Tricycle move");
        }
    }


     class UnicycleFactory implements CycleFactory {
        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    }


    class BicycleFactory implements CycleFactory {
        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    }

    class TricycleFactory implements CycleFactory {
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    }


