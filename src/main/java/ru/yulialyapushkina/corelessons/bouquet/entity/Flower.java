package ru.yulialyapushkina.corelessons.bouquet.entity;

public class Flower {
    String name;
    String color;

    public Flower(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public Flower(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString (){
        return name + " " + color;
    }
}
