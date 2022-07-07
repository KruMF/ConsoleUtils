package consoleUtils;

import java.text.DecimalFormat;

//TODO: add javadoc
public class NumberFormatter {
    private static final String
            NUMBER_SYMBOL = "#",
            DECIMAL_SEPARATOR = ".";
    public static String doubleToString(double d, int decimalPlaces) {
        return getDecimalFormat(decimalPlaces).format(d);
    }

    private static DecimalFormat getDecimalFormat(int decimalPlaces) {
        StringBuilder formatStringBuilder = new StringBuilder(NUMBER_SYMBOL);
        if (decimalPlaces > 0) {
            formatStringBuilder.append(DECIMAL_SEPARATOR);
            formatStringBuilder.append(NUMBER_SYMBOL.repeat(decimalPlaces));
        }
        return new DecimalFormat(formatStringBuilder.toString());
    }
}