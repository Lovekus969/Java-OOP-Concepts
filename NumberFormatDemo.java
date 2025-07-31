import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
    public static void main(String[] args) {
        double amount = 123456.789;
        double percent = 0.7543;

        // Currency in default locale (e.g., en_US) 
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();  // a method tha5 return a number format object that format the currency value 
        System.out.println("Currency (Default Locale): " + currencyFormat.format(amount));

        // Currency in India locale
        Locale india = new Locale("en", "IN");
        NumberFormat indiaCurrency = NumberFormat.getCurrencyInstance(india);
        System.out.println("Currency (India): " + indiaCurrency.format(amount));

        // Percent format
        NumberFormat   percentFormat = NumberFormat.getPercentInstance(); // a method tha5 return a number format object that format the percentage value 
        percentFormat.setMinimumFractionDigits(2);
        percentFormat.setMaximumFractionDigits(3);
        System.out.println("Percentage: " + percentFormat.format(percent));

        // Number format
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMinimumFractionDigits(1);
        numberFormat.setMaximumFractionDigits(2);
        System.out.println("Formatted Number: " + numberFormat.format(amount));

        // Parsing back string to number
        try {
            Number parsed = numberFormat.parse("123456.79");
            System.out.println("Parsed Number: " + parsed);
        } catch (Exception e) {
            System.out.println("Parse error: " + e.getMessage());
        }
    }
}
