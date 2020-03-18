package com.example.wtww;


public class WeirdWordDeck {

    private static final String[] weirdWord = {

            "Flawsome",
            "Fudgel",
            "Unkeyboardinated",
            "Rawgabbit",
            "Abbiocco",
            "Textpectation"
    };
    private static final String[] weirdMeaning = {

            "An individual who embraces their flaws and knows they are awesome regardless",
            "Pretending to work when you are actually not doing anything",
            "When you are unable to type without repeatedly making mistakes",
            "Someone who speaks confidently on a subject of which they know absolutely nothing",
            "Drowsiness after eating a large meal",
            "The anticipation felt when waiting for a response to a text"
    };
    public static String[] shuffleAndPick(){
        String[] word = new String[2];
        int num = (int) (Math.random()*weirdWord.length);
        word[0] = weirdWord[num];
        word[1] = weirdMeaning[num];
        return word;
    }
}