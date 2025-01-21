package Lecture_23.src.Dz;

public class MonthDaysFinder {

    public static void main(String[] args) {

        String month = "Березень";

        int amountOfDays = 0;
        switch (month) {
            case "Січень", "Березень", "Липень", "Серпень", "Жовтень", "Грудень":
                amountOfDays = 31;
                break;
            case "Лютий":
                amountOfDays = 28;
                break;
            case "Квітень", "Травень", "Червень", "Вересень", "Листопад":
                amountOfDays = 30;
                break;
            default:
                amountOfDays = 0;
        }

        System.out.println("Днів в " + month + " - " + amountOfDays + " днів.");

    }

}
