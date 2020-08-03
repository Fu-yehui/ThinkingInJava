package com.roger.ThinkingInJava.Chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Gerbil {
    private static int counter=0;
    private final int id=counter++;

    public void hop(){
        System.out.println(id+" gerbil is jump!");;
    }

    @Override
    public String toString(){
        return "Gerbil ID: "+id;
    }

    public static void main(String[] args) {
//        ArrayList<Gerbil> list=new ArrayList<>();
//        list.add(new Gerbil());
//        list.add(new Gerbil());
//        list.add(new Gerbil());
//        for(int i=0;i<list.size();i++){
//            list.get(i).hop();
//        }


        Map<String,Gerbil> map=new HashMap<String,Gerbil>();
        map.put("Fuzzy",new Gerbil());
        map.put("Spot",new Gerbil());
        map.put("Brody",new Gerbil());

        Iterator<String> iterator=map.keySet().iterator();
        while(iterator.hasNext()){
            String key=iterator.next();
            Gerbil gerbil=map.get(key);
            System.out.println(key+" "+gerbil+" ");
            gerbil.hop();
        }



    }
}
