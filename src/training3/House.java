package training3;


import java.util.Calendar;

public class House {
    private int floorCount;
    private int buildYear;
    private String name;


    public void setAll(int floorCount, int buildYear, String name) {
        this.floorCount = floorCount;
        this.buildYear = buildYear;
        this.name = name;
    }

    @Override
    public String toString() {
        return "House{" +
                "floorCount=" + floorCount +
                ", buildYear=" + buildYear +
                ", name='" + name + '\'' +
                '}';
    }


    public int getYearsFromBuild(){
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.YEAR)-buildYear;
    }
}
