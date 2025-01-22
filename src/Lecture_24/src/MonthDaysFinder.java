package Lecture_24.src;

public class MonthDaysFinder {

    public String getDaysForMonth(String month) {
        String result = "getDaysForMonth_DEFAULT_RESULT";
        int amountOfDays = -1;

        switch (month.toLowerCase()) {
            case "січень", "березень", "липень", "серпень", "жовтень", "грудень":
            case "january", "march", "july", "august", "october", "december":
                amountOfDays = 31;
            case "лютий":
            case "february":
                amountOfDays = 28;
            case "квітень", "травень", "червень", "вересень", "листопад":
            case "april", "may", "june", "september", "november":
                amountOfDays = 30;
            default:
                if (amountOfDays > 0)
                    result = "Днів в " + month + " - " + amountOfDays + " днів.";
                else
                    throw new IllegalArgumentException("invalid month: " + month);
        }

        return result;
    }
}
