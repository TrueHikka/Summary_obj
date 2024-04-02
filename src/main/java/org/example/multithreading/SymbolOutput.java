package org.example.multithreading;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
class SymbolOutput extends Thread {
    private StringBuilder stringBuilder;
    private AtomicInteger counter;

    public SymbolOutput(StringBuilder sb, AtomicInteger counter) {
        this.stringBuilder = sb;
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (stringBuilder) {
                log.debug(Character.toString(stringBuilder.charAt(0)));
                stringBuilder.setCharAt(0, (char) (stringBuilder.charAt(0) + 1));
            }
            counter.incrementAndGet();
        }
    }
}
