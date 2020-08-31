package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;/* формула перевода рублей в евро. */
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(250);
        System.out.println("250 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(250);
        System.out.println("250 rubles are " + dollar + " dollar.");
    }
}