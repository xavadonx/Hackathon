package com.example.zer.hackathon;

import java.util.ArrayList;
import java.util.List;

public class Weathers {

    private static Weathers ourInstance = new Weathers();

    public static Weathers getInstance() {
        return ourInstance;
    }

    private Weathers() {
    }

    private List<Model> weathers = new ArrayList<>();

    public List<Model> getList() {
        return weathers;
    }

    public Model get(int i) {
        return weathers.get(i);
    }

    public void addValue(Model model) {
        weathers.add(model);
    }
}
