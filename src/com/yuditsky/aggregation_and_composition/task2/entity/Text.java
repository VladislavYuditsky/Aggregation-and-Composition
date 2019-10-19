package com.yuditsky.aggregation_and_composition.task2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {
    private ArrayList<Sentence> sentences;
    private String title;

    public Text() {
    }

    public Text(ArrayList<Sentence> sentences, String title) {
        this.sentences = sentences;
        this.title = title;
    }

    public List<Sentence> getSentences() {
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

    @Override
    public String toString() {
        return "Text{" +
                "sentences=" + sentences +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return sentences.equals(text.sentences) &&
                title.equals(text.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentences, title);
    }
}
