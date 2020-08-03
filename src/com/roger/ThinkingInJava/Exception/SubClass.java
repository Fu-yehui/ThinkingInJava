package com.roger.ThinkingInJava.Chapter12;

public class SubClass extends SecondClass{
    @Override
    public void f() {
        try {
            throw new ThirdException();
        }catch(ThirdException ex) {
            throw new RuntimeException(ex);
        }
    };

    public static void main(String[] args) {
        SuperClass sc=new SubClass();
        try {
            sc.f();
        }catch (SuperException ex) {
            System.out.println(ex);
        }catch(RuntimeException ex){
            try {
                throw ex.getCause();
            }catch (Throwable e){
                System.out.println(e);
            }
        }
    }

}

class SecondClass extends SuperClass{
    @Override
    public void f() throws SecondException{
        throw new SecondException();
    };
}
class SuperClass{
    public void f() throws SuperException{
        throw new SuperException();
    }
}
