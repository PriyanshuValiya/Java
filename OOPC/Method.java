package Java.OOPC;
/* Method Overloading */

public class Method {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(8, 4));
        System.out.println(calc.sum((float)5.6, (float)8.7));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a+b;
    }

    int sum(int a, int b, int c) {
        return a+b+c;
    }

    float sum(float a, float b) {
        return a+b;
    }
}