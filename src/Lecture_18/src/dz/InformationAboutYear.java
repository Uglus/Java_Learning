package Lecture_18.src.dz;

public class InformationAboutYear {

    final int year;
    final String info;

    public InformationAboutYear(int year, String info){
        this.year = year;
        this.info = info;
    }

    public void showInfo(){
        System.out.println("Information about this year: \n" +
                "Year: " + year +"\n"+
                "Info: " + info +"\n");
    }

}
