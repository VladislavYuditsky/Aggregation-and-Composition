package com.yuditsky.aggregation_and_composition.task2.entity;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + words +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return words.equals(sentence.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }
}
