package ru.yulialyapushkina.corelessons.week4.main;

import ru.yulialyapushkina.corelessons.week4.entity.Fish;
import ru.yulialyapushkina.corelessons.week4.entity.Ship;
import ru.yulialyapushkina.corelessons.week4.service.SwimmingExecutor;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Ship ship = new Ship();
        SwimmingExecutor swimmingExecutor = new SwimmingExecutor();
        swimmingExecutor.makeSwim(fish);
        swimmingExecutor.makeSwim(ship);
    }
}
