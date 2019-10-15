package com.yuditsky.aggregation_and_composition.task2.entity;

import java.util.ArrayList;

public class Sentence {
    private ArrayList<Word> words;

    public Sentence() {
    }

    public Sentence(ArrayList<Word> words) {
        this.words = new ArrayList<>(words);
    }

    public ArrayList<Word> getWords() {
        return words;
    }

    public void setWords(ArrayList<Word> words) {
        this.words = words;
    }
}
