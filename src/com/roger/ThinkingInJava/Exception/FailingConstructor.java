package com.roger.ThinkingInJava.Chapter12;

public class FailingConstructor {
    public FailingConstructor() throws Exception{

    }

    /**
     * 清理方法
     * @throws Exception
     */
    public void dispose() throws Exception{

    }


    public static void main(String[] args) {

        try{
            FailingConstructor failingConstructor=new FailingConstructor();
            //在创建需要清理的对象之后，立即进入try-finally语句块
            try{

            }catch (Exception ex){

            }finally{
                failingConstructor.dispose();  //正确进行对象的清理
            }
        }catch (Exception ex){
            System.out.println("FailingConstructor 构造器抛出异常,此时未正确创建对象，无需调用清理方法");
        }
    }
}
