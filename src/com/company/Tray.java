package com.company;

import java.util.ArrayList;

public class Tray {
    private ArrayList<Counter> counters = new ArrayList<>();

    public ArrayList<Counter> getCounters() {
        return counters;
    }

    public Counter getCounter(int index) {
        return counters.get(index);
    }

    public void addCounter(Counter counter) {
        this.counters.add(counter);
    }
}
