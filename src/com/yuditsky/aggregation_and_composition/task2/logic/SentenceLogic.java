package com.yuditsky.aggregation_and_composition.task2.logic;

import com.yuditsky.aggregation_and_composition.task2.entity.Sentence;
import com.yuditsky.aggregation_and_composition.task2.entity.Word;

public class SentenceLogic {

    public static String convert(Sentence sentence){
        String buffer = new String();

        for(Word word : sentence.getWords()){
            buffer += word.getWord();
            buffer += " ";
        }

        StringBuilder resSentence = new StringBuilder(buffer);
        resSentence.setCharAt(buffer.length() - 1, '.');

        return resSentence.toString();
    }
}
