import java.util.StringTokenizer;

public class DateComponent { //class to extract day month and year from a date string

    private String month, day, year;// holds month, day, and year

    public DateComponent(String dateStr){//constructor that takes in a string date and separates it

        //Creates a StringTokenizer object with the delimiter /
        StringTokenizer strTokenizer = new StringTokenizer(dateStr, "/");

        month = strTokenizer.nextToken(); //first token, the month
        day = strTokenizer.nextToken(); //second token, the day
        year = strTokenizer.nextToken(); //third token, the year
    }
            //Mennua Netri Herta Davis
    public String getMonth() {//returns the month held in the constructed object
        return month;
    }

    public String getDay() {//returns the day held in the constructed object
        return day;
    }

    public String getYear() {//returns the year held in the constructed object
        return year;
    }

}
