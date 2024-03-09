package ru.calculator;

public class MathFunc {
    public static int func1(int x) {
        int result3 = x * x + 1;
        return result3;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result3 = MathFunc.func1(100);
        int result2 = MathFunc.func2(5);
        int total = result3;
        System.out.println(total);

    }

}
