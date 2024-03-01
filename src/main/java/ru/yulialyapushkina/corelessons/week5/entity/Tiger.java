package ru.yulialyapushkina.corelessons.week5.entity;

public class Tiger extends AbstractAnimal{
    @Override
    void makevoice() {
        System.out.println("Тигр рычит");
    }
    @Override
     void walk (){
        System.out.println("Тигр бегает");
    }
}
