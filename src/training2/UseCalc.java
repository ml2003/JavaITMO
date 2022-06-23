package training2;

public class UseCalc {
    public static void main(String[] args) {
        int a = 15;
        int b = 23;
        double c = 23.33466;
        double d = 121323.45454;
        long e = 232323L;
        long g = 27382837L;

        Calculator calc = new Calculator();

        //для int
        System.out.println("Для целых чисел " + a + " и " + b);
        System.out.println("Сумма =" + calc.sum(a, b));
        System.out.println("Деление =" + calc.division(a, b));
        System.out.println("Умножение =" + calc.multiply(a, b));
        System.out.println("Вычитание =" + calc.subtraction(a, b));

        //для long
        System.out.println("Для long чисел " + e + " и " + g);
        System.out.println("Сумма =" + calc.sum(e, g));
        System.out.println("Деление =" + calc.division(e, g));
        System.out.println("Умножение =" + calc.multiply(e, g));
        System.out.println("Вычитание =" + calc.subtraction(e, g));

        //для double
        System.out.println("Для double чисел " + c + " и " + d);
        System.out.println("Сумма =" + calc.sum(c, d));
        System.out.println("Деление =" + calc.division(c, d));
        System.out.println("Умножение =" + calc.multiply(c, d));
        System.out.println("Вычитание =" + calc.subtraction(c, d));

    }
}
