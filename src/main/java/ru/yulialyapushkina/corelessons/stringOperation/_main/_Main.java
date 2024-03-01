package ru.yulialyapushkina.corelessons.stringOperation._main;

import java.util.Arrays;
import java.util.List;

public class _Main {

    public static void main(String[] args) {
       String str = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
       String strLowerCase = str.toLowerCase();
       int startIndex = strLowerCase.indexOf("object-oriented programming");
       int secondIndex = strLowerCase.indexOf("object-oriented programming", startIndex+1);
        System.out.println(secondIndex);


    }

    public int checkIndex (int index, String str){
        int nextIndex = str.indexOf("object-oriented programming", index +1);
        return nextIndex;
    }
    public static void printString (String string ){
        System.out.println(string);
    }
}

