package eif;

import org.joda.time.*;
import org.joda.time.LocalDate;
import java.util.Locale;
import static java.util.Locale.ENGLISH;

public class Main {

    int [] k = {1,5,9};
   static LocalDate [] datos = {
            (new LocalDate("2017-09-08")),
            (new LocalDate("2017-10-08")),
            (new LocalDate("2017-11-08"))
    };


    public static Days daysToNewYear(LocalDate fromDate) {
        LocalDate newYear = fromDate.plusYears(1).withDayOfYear(1);
        return Days.daysBetween(fromDate, newYear);
    }

    public static void metodas() {
        ll +=66;
        for ( LocalDate item: datos ) {
          System.out.println(item+" liko "+daysToNewYear(item).getDays());
         }

        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i]+" liko "+daysToNewYear(datos[i]).getDays());
        }
    }

    static int ll = 10;
    public static void main(String[] args) {


        ll += 5;

        System.out.println("---------------------------"+ll);
        metodas();

        System.out.println("---------------------------"+ll);
        // System.out.println(""+daysToNewYear(new LocalDate("2017-09-08")).getDays());


    }

}
