// Создать объект класса Текст, используя классы Предложение, Слово.
// Методы: дополнить текст, вывести на консоль текст, заголовок текста.

package com.yuditsky.aggregation_and_composition.task2;

import com.yuditsky.aggregation_and_composition.task2.entity.Sentence;
import com.yuditsky.aggregation_and_composition.task2.entity.Text;
import com.yuditsky.aggregation_and_composition.task2.entity.Word;
import com.yuditsky.aggregation_and_composition.task2.logic.TextLogic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Word> words = new ArrayList<>();
        ArrayList<Sentence> sentences = new ArrayList<>();

        words.add(new Word("Раз"));
        words.add(new Word("Два"));
        words.add(new Word("Три"));

        sentences.add(new Sentence(words));

        words.add(new Word("Четыре"));
        words.add(new Word("Пять"));

        sentences.add(new Sentence(words));

        Text text = new Text( sentences, "Счёт");

        System.out.println(TextLogic.convert(text));
    }
}
