import java.text.NumberFormat;
import java.util.Locale;
 

public class FormatDemo {
    public static void main(String[] args) {
        double amount = 123456.789;

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat percent = NumberFormat.getPercentInstance();

        us.setMinimumFractionDigits(2);
        india.setMaximumFractionDigits(1);

        System.out.println("US: " + us.format(amount));
        System.out.println("India: " + india.format(amount));
        System.out.println("Percent: " + percent.format(0.789));
    }
}
