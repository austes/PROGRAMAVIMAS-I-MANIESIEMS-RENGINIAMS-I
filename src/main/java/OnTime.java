import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class OnTime {

    public static void main(String[] args) {
        DateTimeZone localTimeZone = DateTimeZone.forID("Europe/Vilnius");

        DateTime utcTime = new DateTime(2017, 9, 12, 11, 40,
                DateTimeZone.UTC);
        DateTime localTime = utcTime.withZone(localTimeZone);

        System.out.println("Data and time in utc 00:00 Time zone: " + utcTime);
        System.out.println("Data and time in Lithuania: " +localTime);
    }
}
