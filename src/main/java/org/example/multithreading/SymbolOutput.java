package org.example.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

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
                System.out.println(stringBuilder.charAt(0));
                stringBuilder.setCharAt(0, (char) (stringBuilder.charAt(0) + 1));
            }
            counter.incrementAndGet();
        }
    }
}
