package org.example.multithreading;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class Main {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("a");
        AtomicInteger counter = new AtomicInteger(0);

        SymbolOutput symbolThread_1 = new SymbolOutput(stringBuilder, counter);
        SymbolOutput symbolThread_2 = new SymbolOutput(stringBuilder, counter);
        SymbolOutput symbolThread_3 = new SymbolOutput(stringBuilder, counter);

        symbolThread_1.start();
        symbolThread_2.start();
        symbolThread_3.start();

        try {
            symbolThread_1.join();
            symbolThread_2.join();
            symbolThread_3.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        log.debug("Суммарная отработка трех потоков: " + counter.get());
    }
}
