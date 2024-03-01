package ru.yulialyapushkina.corelessons.week5._main;

import ru.yulialyapushkina.corelessons.week5.entity.Monkey;
import ru.yulialyapushkina.corelessons.week5.entity.Seal;
import ru.yulialyapushkina.corelessons.week5.entity.Tiger;
import ru.yulialyapushkina.corelessons.week5.entity.ZooKeeper;

public class _Main {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Monkey monkey = new Monkey();
        Seal seal = new Seal();
        zooKeeper.makeVoice(tiger);
        zooKeeper.makeVoice(monkey);
        zooKeeper.makeVoice(seal);
        zooKeeper.makeWalk(tiger);
        zooKeeper.makeWalk(monkey);
        zooKeeper.makeWalk(seal);
        zooKeeper.makeSleep(tiger);
        zooKeeper.makeSleep(monkey);
        zooKeeper.makeSleep(seal);

    }
}
