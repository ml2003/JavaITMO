package training4;

public class JavaProgramm {
    public static void main(String[] args) {
        int from = 1;
        int to = 100;
        Division division = new Division();

        System.out.println("Делится на 3 : " + division.isdivtothree(from, to));
        System.out.println("Делится на 5 :" + division.isdivtofive(from, to));
        System.out.println("Делится на 3 и 5 :" + division.isdivtothreefive(from, to));
    }

}
