package com.genus;

import java.util.HashMap;

public class Translator {


    private static final HashMap<String, String> alBhedMap;
    static
    {
        alBhedMap = new HashMap<>();

        alBhedMap.put("E","A");
        alBhedMap.put("P","B");
        alBhedMap.put("S","C");
        alBhedMap.put("T","D");
        alBhedMap.put("I","E");
        alBhedMap.put("W","F");
        alBhedMap.put("K","G");
        alBhedMap.put("N","H");
        alBhedMap.put("U","I");
        alBhedMap.put("V","J");
        alBhedMap.put("G","K");
        alBhedMap.put("C","L");
        alBhedMap.put("L","M");
        alBhedMap.put("R","N");
        alBhedMap.put("Y","O");
        alBhedMap.put("B","P");
        alBhedMap.put("X","Q");
        alBhedMap.put("H","R");
        alBhedMap.put("M","S");
        alBhedMap.put("D","T");
        alBhedMap.put("O","U");
        alBhedMap.put("F","V");
        alBhedMap.put("Z","W");
        alBhedMap.put("Q","X");
        alBhedMap.put("A","Y");
        alBhedMap.put("J","Z");
        alBhedMap.put(" "," ");
        alBhedMap.put("1","1");
        alBhedMap.put("2","2");
        alBhedMap.put("3","3");
        alBhedMap.put("4","4");
        alBhedMap.put("5","5");
    }

    public static String ToAlBhed(String englishSentence) {
        // TODO: Your code goes here
        String alBhedSentence = "";

        englishSentence = englishSentence.toUpperCase();
        englishSentence = replaceSpecial(englishSentence);

        int strLen = englishSentence.length();

        for(int i = 0; i <= strLen; i++)
        {
            if(i+1 <= strLen)
                alBhedSentence += alBhedMap.get(englishSentence.substring(i,i+1));
        }

        alBhedSentence = unreplaceSpecial(alBhedSentence);

        return alBhedSentence;
    }

    private static String unreplaceSpecial(String alBhedSentence){

        alBhedSentence = alBhedSentence.replace("1","FIEND");

        alBhedSentence = alBhedSentence.replace("2","MAGIC");

        alBhedSentence = alBhedSentence.replace("3","AEON");

        alBhedSentence = alBhedSentence.replace("4","AIRSHIP");

        alBhedSentence = alBhedSentence.replace("5","SIN");

        return alBhedSentence;
    }

    private static String replaceSpecial(String englishSentence){

        englishSentence = englishSentence.replace("FIEND","1");

        englishSentence = englishSentence.replace("MAGIC","2");

        englishSentence = englishSentence.replace("AEON","3");

        englishSentence = englishSentence.replace("AIRSHIP","4");

        englishSentence = englishSentence.replace("SIN","5");

        return englishSentence;
    }

}
