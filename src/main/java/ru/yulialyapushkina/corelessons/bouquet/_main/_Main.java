package ru.yulialyapushkina.corelessons.bouquet._main;

import ru.yulialyapushkina.corelessons.bouquet.entity.Bouquet;
import ru.yulialyapushkina.corelessons.bouquet.entity.Flower;
import ru.yulialyapushkina.corelessons.bouquet.service.BouquetService;

public class _Main {
    public static void main(String[] args) {

        Flower [] flowersArr = new Flower[5];
        flowersArr [0] = new Flower("Rose", "Red");
        flowersArr [1] = new Flower("Rose", "White");
        flowersArr [2] = new Flower("Rose", "Blue");
        flowersArr [3]= new Flower("Rose", "Yellow");
        flowersArr [4] = new Flower("Rose", "Rose");

        Bouquet bouquet = new Bouquet();

        BouquetService bouquetService = new BouquetService();
        bouquet = bouquetService.collectBouquet(flowersArr);
        System.out.println(bouquet);
    }
}
