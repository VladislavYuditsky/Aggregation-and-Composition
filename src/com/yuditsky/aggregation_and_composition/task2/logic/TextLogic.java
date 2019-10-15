package com.yuditsky.aggregation_and_composition.task2.logic;

import com.yuditsky.aggregation_and_composition.task2.entity.Sentence;
import com.yuditsky.aggregation_and_composition.task2.entity.Text;

public class TextLogic {

    public static String convert(Text text) {
        String resString = new String();

        resString += text.getTitle();
        resString += "\n";
        for (Sentence sentence : text.getSentences()) {
            resString += SentenceLogic.convert(sentence);
            resString += " ";
        }

        return resString;
    }

    public static void addSentence(Text text, Sentence sentence){
        text.getSentences().add(sentence);
    }
}
