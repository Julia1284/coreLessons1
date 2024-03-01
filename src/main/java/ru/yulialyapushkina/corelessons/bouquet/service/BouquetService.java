package ru.yulialyapushkina.corelessons.bouquet.service;

import ru.yulialyapushkina.corelessons.bouquet.entity.Bouquet;
import ru.yulialyapushkina.corelessons.bouquet.entity.Flower;

public class BouquetService {
    public Bouquet collectBouquet (Flower[]flowersArr){
        Bouquet bouquet= new Bouquet();
        for (int i = 0; i< flowersArr.length; i++){
            Flower currentFlower = flowersArr[i];
            bouquet.addFlowers(currentFlower);
        }
     return  bouquet;
    }
}
