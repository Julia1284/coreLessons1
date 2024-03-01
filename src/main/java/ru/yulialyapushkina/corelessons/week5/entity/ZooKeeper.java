package ru.yulialyapushkina.corelessons.week5.entity;

public class ZooKeeper {
    public  void makeVoice (AbstractAnimal abstractAnimal){
        System.out.println("Смотритель дает животному команду ГОЛОС");
        abstractAnimal.makevoice();
    }

    public  void  makeWalk (AbstractAnimal abstractAnimal){
        System.out.println("Смотритель дает животному команту ГУЛЯТЬ");
        abstractAnimal.walk();
    }
    public void makeSleep (AbstractAnimal abstractAnimal){
        System.out.println( "Смотритель дает животному команду СПАТЬ");
        abstractAnimal.sleep();
    }
}
