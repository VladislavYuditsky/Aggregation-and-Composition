package com.yuditsky.aggregation_and_composition.task2.entity;

import java.util.ArrayList;

public class Text {
    private ArrayList<Sentence> sentences;
    private String title;

    public Text(){}

    public Text(ArrayList<Sentence> sentences, String title) {
        this.sentences = sentences;
        this.title = title;
    }

    public ArrayList<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(ArrayList<Sentence> sentences) {
        this.sentences = sentences;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
