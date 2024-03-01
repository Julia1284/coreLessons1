package ru.yulialyapushkina.corelessons.week5.entity;

public class Seal extends AbstractAnimal {
    @Override
    void makevoice() {
        System.out.println("Тюлень издает звук");
    }

    @Override
    void walk (){
        System.out.println("Тюлень плавает");
    }
}
