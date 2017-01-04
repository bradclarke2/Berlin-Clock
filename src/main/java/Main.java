import org.joda.time.DateTime;
import java.util.Date;



public class Main {
    public static void main(String[] args) {

        java.util.Date juDate = new Date();
        DateTime dt = new DateTime(juDate);

        int hours = dt.getHourOfDay();
        int minutes = dt.getMinuteOfHour();
        int seconds = dt.getSecondOfMinute();

        System.out.println("Time is " +hours+":"+minutes+":"+seconds);

        int row_one;
        int row_two;


        if (hours == 00){
            row_one = 0;
            row_two = 0;
        } else {
            row_one = hours/5;
            row_two = hours%5;
        }
        String lampOne = getLamp(row_one);
        String lampTwo = getLamp(row_two);

        int row_three = minutes/5;
        int row_four = minutes%5;

        String lampThree = getFiveMinuteLamp(row_three);
        String lampFour = getLamp(row_four);

        boolean top_lamp;
        String seconds_lamp;



        if (seconds%2 == 0){
            seconds_lamp = "Y";


        } else {
            seconds_lamp = "R";
        }


        System.out.println("                     * *");
        System.out.println("                   *     *");
        System.out.println("                  *   "+seconds_lamp+"   *");
        System.out.println("                   *     *");
        System.out.println("                     * *");
        System.out.println(" ╔═══════╗╔═══════╗╔═══════╗╔═══════╗\n" +
                " "+lampOne+"\n" +
                " ╚═══════╝╚═══════╝╚═══════╝╚═══════╝\n" +
                " ╔═══════╗╔═══════╗╔═══════╗╔═══════╗\n" +
                " "+lampTwo+"\n" +
                " ╚═══════╝╚═══════╝╚═══════╝╚═══════╝\n" +
                " ╔═╗╔═╗╔═╗ ╔═╗╔═╗╔═╗ ╔═╗╔═╗╔═╗ ╔═╗╔═╗\n" +
                " "+lampThree+"\n" +
                " ╚═╝╚═╝╚═╝ ╚═╝╚═╝╚═╝ ╚═╝╚═╝╚═╝ ╚═╝╚═╝\n" +
                " ╔═══════╗╔═══════╗╔═══════╗╔═══════╗\n" +
                " "+lampFour+"\n" +
                " ╚═══════╝╚═══════╝╚═══════╝╚═══════╝");


    }

public static String getLamp(int i){
        switch (i){
            case 0:    return "║   R     ║║   R    ║║   R     ║║   R    ║";
            case 1:    return "║   Y     ║║   R    ║║   R     ║║   R    ║";
            case 2:    return "║   Y     ║║   Y    ║║   R     ║║   R    ║";
            case 3:    return "║   Y     ║║   Y    ║║   Y     ║║   R    ║";
            case 4:    return "║   Y     ║║   Y    ║║   Y     ║║   Y    ║";
            default:    return "cannot populate the clock";
        }


    }

    public static String getFiveMinuteLamp(int x){
    switch (x){
        case 0:    return "║R║║R ║║R║ ║R║║R║║R║ ║R ║║R║║R║ ║R║║R║";
        case 1:    return "║Y║║R ║║R║ ║R║║R║║R║ ║R ║║R║║R║ ║R║║R║";
        case 2:    return "║Y║║Y ║║R║ ║R║║R║║R║ ║R ║║R║║R║ ║R║║R║";
        case 3:    return "║Y║║Y ║║Y║ ║R║║R║║R║ ║R ║║R║║R║ ║R║║R║";
        case 4:    return "║Y║║Y ║║Y║ ║Y║║R║║R║ ║R ║║R║║R║ ║R║║R║";
        case 5:    return "║Y║║Y ║║Y║ ║Y║║Y║║R║ ║R ║║R║║R║ ║R║║R║";
        case 6:    return "║Y║║Y ║║Y║ ║Y║║Y║║Y║ ║R ║║R║║R║ ║R║║R║";
        case 7:    return "║Y║║Y ║║Y║ ║Y║║Y║║Y║ ║Y ║║R║║R║ ║R║║R║";
        case 8:    return "║Y║║Y ║║Y║ ║Y║║Y║║Y║ ║Y ║║Y║║R║ ║R║║R║";
        case 9:    return "║Y║║Y ║║Y║ ║Y║║Y║║Y║ ║Y ║║Y║║Y║ ║R║║R║";
        case 10:    return "║Y║║Y ║║Y║ ║Y║║Y║║Y║ ║Y ║║Y║║Y║ ║Y║║R║";
        case 11:    return "║Y║║Y ║║Y║ ║Y║║Y║║Y║ ║Y ║║Y║║Y║ ║Y║║Y║";
        default:    return "cannot populate the clock";

    }
    }
}
