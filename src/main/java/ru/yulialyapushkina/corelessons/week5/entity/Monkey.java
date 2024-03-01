package ru.yulialyapushkina.corelessons.week5.entity;

public class Monkey extends AbstractAnimal{
    @Override
    void makevoice() {
        System.out.println("Обезьяна кричит");
    }

    @Override
    void walk(){
        System.out.println("Обeзьяна лазает по деревьям");
    }

}
