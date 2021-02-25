package com.company;

public class CounterSub extends Counter {

    public CounterSub(int i) {
        super(i);
    }

    @Override
    public void increment() {
        super.increment();
        System.out.println(i);
    }
}
