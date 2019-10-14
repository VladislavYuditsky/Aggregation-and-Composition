package com.yuditsky.aggregation_and_composition.task2.entity;

import java.util.ArrayList;

public class Sentence {
    private ArrayList<Word> sentence;

    public Sentence(){}

    public Sentence(ArrayList<Word> sentence) {
        this.sentence = sentence;
    }

    public ArrayList<Word> getSentence() {
        return sentence;
    }

    public void setSentence(ArrayList<Word> sentence) {
        this.sentence = sentence;
    }
}
