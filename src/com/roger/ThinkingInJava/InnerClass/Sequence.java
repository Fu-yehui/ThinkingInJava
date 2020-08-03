package com.roger.ThinkingInJava.Chapter10;

public class Sequence {
    private String outerName;

    public Sequence(String name){
        this.outerName=name;
    }

    public class Inner{


        private String innerName;

        public Inner(String name){
            this.innerName=name;
        }
        @Override
        public String toString(){
            return innerName;
        }

        /**
         * 内部类能访问到外部类的任何权限的字段
         * @return
         */
        public String toOuterString(){
            return Sequence.this.outerName;
        }

        /**
         * 内部类能访问到外部类的任何权限的方法
         */
        public void innerPrint(){
            print();
        }
        private void p(){
            System.out.println("innerClass private method");
        }

        /**
         * 返回外部类的引用
         * @return
         */
        public Sequence getOuter(){
            return Sequence.this;
        }
        /**
         * @return
         */
        public Inner getInner(){
            return Inner.this;
        }


    }

    private  void print(){
        System.out.println("outerClass private method");
    }

    public Inner getInner(String name){
        return new Inner(name);
    }


    public static void main(String[] args) {
        Sequence s=new Sequence("outer");
        Sequence.Inner inner=s.getInner("inner");
        System.out.println(inner.toString());
        System.out.println(inner.toOuterString());
        inner.innerPrint();
        inner.p();
        inner.getOuter().print();
        inner.getInner().p();

        Sequence.Inner i1=s.new Inner("i1");
        System.out.println(i1.toString());

    }
}



