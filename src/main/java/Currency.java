
import java.text.NumberFormat;
import java.util.Locale;

public class Currency {


    public static void main(String[] args) {
        java.util.Currency curr = java.util.Currency.getInstance("EUR");
        java.util.Currency currLoc = java.util.Currency.getInstance(new Locale("de", "DE"));
        System.out.println("EUR symbol: "+curr.getSymbol(new Locale("de", "DE")));

        Double number = 1500D;

        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        String currency = format.format(number);
        System.out.println("Currency in Japan: " + currency);
    }

    }
