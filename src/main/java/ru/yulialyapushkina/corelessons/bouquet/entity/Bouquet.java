package ru.yulialyapushkina.corelessons.bouquet.entity;

import java.util.ArrayList;

public class Bouquet {

    private ArrayList <Flower> flowers;

    public Bouquet() {
        flowers = new ArrayList<>();
    }

    public void addFlowers (Flower flower){
        if (flower != null ){
            flowers.add(flower);
        }
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        int size = flowers.size();
        sb.append("Bouquet: ");
        String currentFlowerStr;
        for (int i=0; i< size; i++){
            currentFlowerStr = flowers.get(i).toString();
            sb.append(currentFlowerStr).append(',');
        }
        return sb.toString();
    }
}
