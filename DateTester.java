
public class DateTester {
    public static void main(String[] args){

        String date = "10/23/2011"; //date string
        DateComponent dc = new DateComponent(date); //Creates a DateComponent object named dc
        //Mennua Netri Herta Davis
        System.out.println("Here's the date: " + date);//prints original string
        System.out.println("The month is " + dc.getMonth());//prints month
        System.out.println("The day is " + dc.getDay());//prints day
        System.out.println("The year is " + dc.getYear());//prints year
    }
}
