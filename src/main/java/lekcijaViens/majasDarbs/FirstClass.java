package lekcijaViens.majasDarbs;

import java.math.BigInteger;

public class FirstClass {
    public static void main(String[] args) {

        // Mainīgo definēšana
        String countryName = "Ķīna";
        int population = 1412600000;
        int area = 9596961;
        String capital = "Beijing jeb Pekina";
        String language = "Ķīniešu";
        boolean checkIsInEU = false;
        String isInEU;
        char currencyYuan = '¥';
        char currencyUSD = '$';

        float densityFloat;
        int densityInteger;
        long gdpTotalUSD = 30180000000000L;
        double gdpPerPersonUSD;
        double gdpPerPersonYuan;
        double currencyExchangeRate = 7.12;
        byte counter = 1;

        // Vai Ķīna ir Eiropas Savienībā?
        if (checkIsInEU == true) {
            isInEU = "IR";
        }
        else {
            isInEU = "NAV";
        }

        // Izvads konsolē
        System.out.println("\nValsts: " + countryName);
        System.out.println("Iedzīvotāju skaits: " + population + " cilvēki");
        System.out.println("Platība: " + area + " km2");
        System.out.println("Galvaspilsēta: " + capital);
        System.out.println("Valsts valoda: " + language);
        System.out.println("Ķīna " + isInEU + " Eiropas savienībā");
        System.out.println("Valsts valūta: " + currencyYuan + " (Juaņa)");

        // Piemēri ar aritmētiskajiem operatoriem
        densityFloat = population / area;
        densityInteger = Math.round(densityFloat);
        System.out.println("\nARITMĒTISKĀ OPERATORA PIEMĒRS #" + counter + " - iedzīvotāju blīvums: " + densityInteger + " cilv./km2");
        counter++;

        gdpPerPersonUSD = gdpTotalUSD / population;
        System.out.println("ARITMĒTISKĀ OPERATORA PIEMĒRS #" + counter + " - ienākumi uz vienu iedzīvotāju: " + gdpPerPersonUSD + " " + currencyUSD +"/cilv.");
        counter++;

        gdpPerPersonYuan = gdpPerPersonUSD * currencyExchangeRate;
        System.out.println("ARITMĒTISKĀ OPERATORA PIEMĒRS #" + counter + " - ienākumi uz vienu iedzīvotāju: " + gdpPerPersonYuan + " " + currencyYuan +"/cilv.");
        counter++;
    }
}
