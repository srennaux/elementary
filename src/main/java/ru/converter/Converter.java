package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 90;
        return rsl;
    }

    public static void main(String[] args) {
        float dollar = rubleToDollar(300);
        float euro = rubleToEuro(300);
        System.out.println("300 rubles are " + dollar);
        System.out.println("300 rubles are " + euro);
    }

}

