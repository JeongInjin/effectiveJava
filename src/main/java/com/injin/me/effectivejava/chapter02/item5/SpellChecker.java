package com.injin.me.effectivejava.chapter02.item5;

import java.util.List;

public class SpellChecker {
    private Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = dictionary;
    }

    private SpellChecker(){}

    public boolean isValid(String word) {
        return true;
    }

    public List<String> suggestions(String typo) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        Lexicon lexicon = new EngDictionary();
        SpellChecker spellChecker = new SpellChecker(lexicon);
        spellChecker.isValid("java");
    }
}

interface Lexicon {}

class KoreanDictionary implements Lexicon {}

class EngDictionary implements Lexicon {}