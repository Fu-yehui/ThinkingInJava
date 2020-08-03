package com.roger.ThinkingInJava.Chapter7;

/**
 * 类的加载顺序
 *
 * 1。当创建类的第一个对象时，或者是访问static成员变量/static method时，类进行加载
 *
 * 编译器在加载过程中，发现有超类时，会先对超类进行加 载，先加载根类，再依次往下加载，因为子类的static初始化可能会依赖于超类
 *
 * 2。进行static成员变量的初始化  ,依次从超类到子类
 * ----------------------------------------------此时类加载完成
 *  对象的创建
 * 3。在堆中动态的分配内存空间,为超类和子类分配足够的空间
 *
 * 4。将存储空间清零，自动将所有基本类型设置为默认值，对象引用设置为null
 *
 * 5。执行所有出现于字段定义处的初始化动作
 *
 * 6，执行构造器
 *
 * ***以上所有顺序都是先由超类完成，再由子类*****
 *
 *
 */

public class Beetle extends Insect{
    private int k=printInit("Beetle.k initialized");
    public Beetle(){
        System.out.println("k= "+k);
        System.out.println("j= "+j);
    }

    private static int x2=printInit("static Beetle.x2 initialized");

    public static void main(String[] args){    //程序启动后会自动访问main()，该方法时static ，所以会进行类加载
        System.out.println("Beetle constructor");
        Beetle b=new Beetle();
    }
}

class Insect{
    private int i=9;
    protected int j;

    Insect(){
        System.out.println("i= "+i+" ,j= "+j);
        j=39;

    }

    public static int x1=printInit("static Insect.x1 initialized");
    static int printInit(String s){
        System.out.println(s);
        return 47;
    }


}