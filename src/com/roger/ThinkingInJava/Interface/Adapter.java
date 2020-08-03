package com.roger.ThinkingInJava.Chapter9;


/**
 * 适配器模式（Adapter Pattern）：  是作为两个不兼容的接口之间的桥梁
 * 接受你拥有的接口（S）,产生你需要的接口（Processor)
 * 同时也使用了代理模式
 */
public class Adapter implements Processor{
    private S s;

    public Adapter(S s){
        this.s=s;
    }
    @Override
    public String name(){
        return s.name();
    }
    @Override
    public String process(Object o){
        return s.process((String)o);
    }
    public static void main(String[] args) {
      //  Apply.process(new S(),"ha");  S类型接口与Processor接口不相同
        Adapter adapter=new Adapter(new S());
        Apply.process(adapter,"haha");
    }
}


class S{
    public String name(){
        return getClass().getSimpleName();
    }
    public String process(String data){
        return data;
    }

}

class Apply{
    public static void process(Processor p, Object s){
        System.out.println("Using Processor "+p.name());
        System.out.println(p.process(s));
    }
}
