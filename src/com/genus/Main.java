package com.genus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String sentence = inputString();
        String sentenceInAlBhed = Translator.ToAlBhed(sentence);
        System.out.println("Al-Bhed: " + sentenceInAlBhed);
    }


    private static String inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("English: ");
        return scanner.nextLine();
    }
}
