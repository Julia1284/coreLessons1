package ru.yulialyapushkina.corelessons.week5.entity;

public abstract class AbstractAnimal {
   void sleep (){
       System.out.println("Животное спит");
    }

    void walk (){
        System.out.println("Животное бегает");
    }
    abstract  void  makevoice ();
}
