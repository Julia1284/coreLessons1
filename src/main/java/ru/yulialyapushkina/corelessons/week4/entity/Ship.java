package ru.yulialyapushkina.corelessons.week4.entity;

import ru.yulialyapushkina.corelessons.week4.service.Swimming;

public class Ship implements Swimming {
    @Override
    public void swim() {
        fuel();
        System.out.println("Корабль плывет");

    }
    private void fuel (){
        System.out.println("Корабль заправился");
    }
}

