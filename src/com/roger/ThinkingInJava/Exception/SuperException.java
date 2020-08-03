package com.roger.ThinkingInJava.Chapter12;

public class SuperException extends Exception{

}
class SecondException extends SuperException{

}
class ThirdException extends SecondException{

}
