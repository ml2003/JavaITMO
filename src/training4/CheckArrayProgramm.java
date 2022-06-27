package training4;

public class CheckArrayProgramm {
    public static void main(String[] args){
        int[] arr = {-5, 2, 10, 7, 45, 485, 4789, 21356, 111111};
        double[] doublearray = {-897.45, -9, 0.0, 12.256, 456.25636};
        String[] strarray = {"Арбуз","Банан","Дыня","Ежевика","Лимон"};

        CheckSortedArray checkSortedArray = new CheckSortedArray();


        System.out.println(checkSortedArray.checkSorted(arr) ? "OK" : "Please try again");
        System.out.println(checkSortedArray.checkSorted(doublearray)? "OK" : "Please try again");
        System.out.println(checkSortedArray.checkSorted(strarray)? "OK" : "Please try again");
    }
}
