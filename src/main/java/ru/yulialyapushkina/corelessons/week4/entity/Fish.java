package ru.yulialyapushkina.corelessons.week4.entity;

import ru.yulialyapushkina.corelessons.week4.service.Swimming;

public class Fish implements Swimming {
    @Override
    public void swim() {
        eat();
        System.out.println("Рыба плавает");
    }
    private void eat() {
        System.out.println("Рыба поела");
    }
}

