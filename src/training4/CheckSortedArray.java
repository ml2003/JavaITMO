package training4;

public class CheckSortedArray {


    public boolean checkSorted(int[] intarray){
        boolean sorted = true;
        for (int i=0; i<intarray.length-1; i++){
             if (intarray[i]>intarray[i+1]){
                 sorted=false;
             }
        }
        return sorted;
    }

    public boolean checkSorted(double[] doublearray){
        boolean sorted = true;
        for (int i=0; i<doublearray.length-1; i++){
            if (doublearray[i]>doublearray[i+1]){
                sorted=false;
            }
        }
        return sorted;
    }


    public boolean checkSorted(String[] stringarray){
        boolean sorted = true;
        for (int i=0; i<stringarray.length-1; i++){
            if (stringarray[i].compareTo(stringarray[i+1])>=0){
                sorted =false;
            }
        }
        return sorted;
    }

}
