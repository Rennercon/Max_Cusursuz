package homework_nr_6;

import java.time.Year;

public class Date {
    private int day = 0;
    private int month = 0;
    private int year = 0;

    public void setDay(int day) {
        if (day < 32 & day > 0) {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if (month < 13 & month > 0) {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if (year > 2022) {
            this.year = year;
        }
    }
    public void displayDate() {
        if (day != 0 & month != 0 & year != 0) {
            System.out.println(day + ":" + month + ":" + year);
        }else {
            System.out.println("Введите дату используя методы 'set'" );
        }
    }

    public static void main(String[] args) {
        Date date = new Date();
        date.setDay(14);
        date.setMonth(9);
        date.setYear(2023);
        date.displayDate();
        date.setDay(21);
        date.displayDate();
        
        

    }
}
