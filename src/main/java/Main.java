import org.joda.time.DateTime;
import java.util.Date;


/**
 * Created by Bradley on 30/12/2016.
 */
public class Main {
    public static void main(String[] args) {

        java.util.Date juDate = new Date();
        DateTime dt = new DateTime(juDate);

        int hours = dt.getHourOfDay();
        int minutes = dt.getMinuteOfHour();
        int seconds = dt.getSecondOfMinute();

        int row_one;
        int row_two;


        if (hours == 00){

            row_one = 0;
            row_two = 0;
        } else {
            row_one = hours/5;
            row_two = hours%5;

        }
        System.out.println(row_one);
        System.out.println(row_two);

        int row_three = minutes/5;
        int row_four = minutes%5;

        System.out.println(row_three);
        System.out.println(row_four);

        boolean top_lamp;
        String seconds_lamp;



        if (seconds%2 == 0){
            top_lamp = false;
            seconds_lamp = "R";


        } else {
            top_lamp = true;
            seconds_lamp = "Y";
        }

        System.out.println(top_lamp);



        System.out.println("                     * *");
        System.out.println("                   *     *");
        System.out.println("                  *   "+seconds_lamp+"   *");
        System.out.println("                   *     *");
        System.out.println("                     * *");
        System.out.println(" ╔═══════╗╔═══════╗╔═══════╗╔═══════╗\n" +
                " ║   R     ║║   R    ║║   R     ║║   R    ║\n" +
                " ╚═══════╝╚═══════╝╚═══════╝╚═══════╝\n" +
                " ╔═══════╗╔═══════╗╔═══════╗╔═══════╗\n" +
                " ║   R     ║║   R    ║║   R     ║║   R    ║\n" +
                " ╚═══════╝╚═══════╝╚═══════╝╚═══════╝\n" +
                " ╔═╗╔═╗╔═╗ ╔═╗╔═╗╔═╗ ╔═╗╔═╗╔═╗ ╔═╗╔═╗\n" +
                " ║Y║║Y ║║R║ ║Y║║Y║║R║ ║Y ║║Y║║R║ ║Y║║Y║\n" +
                " ╚═╝╚═╝╚═╝ ╚═╝╚═╝╚═╝ ╚═╝╚═╝╚═╝ ╚═╝╚═╝\n" +
                " ╔═══════╗╔═══════╗╔═══════╗╔═══════╗\n" +
                " ║   Y     ║║   Y    ║║   Y     ║║   Y    ║\n" +
                " ╚═══════╝╚═══════╝╚═══════╝╚═══════╝");
    }

}
