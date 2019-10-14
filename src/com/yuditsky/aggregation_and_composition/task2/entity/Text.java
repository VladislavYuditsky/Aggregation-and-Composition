package com.yuditsky.aggregation_and_composition.task2.entity;

import java.util.ArrayList;

public class Text {
    private ArrayList<Sentence> text;

    public Text(){}

    public Text(ArrayList<Sentence> text) {
        this.text = text;
    }

    public ArrayList<Sentence> getText() {
        return text;
    }

    public void setText(ArrayList<Sentence> text) {
        this.text = text;
    }
}
