
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class currency {



    public static void main(String[] args) {
        Currency curr = Currency.getInstance("EUR");
        Currency currLoc = Currency.getInstance(new Locale("de", "DE"));
        System.out.println("EUR symbol: "+curr.getSymbol(new Locale("de", "DE")));

        Double number = 1500D;

        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        String currency = format.format(number);
        System.out.println("Currency in Japan: " + currency);
    }

    }
