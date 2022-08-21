package consoleUtils;

import java.text.DecimalFormat;

/**
 * A number formatter for rounding doubles.
 */
public class NumberFormatter {
    private static final String
            NUMBER_SYMBOL = "#",
            DECIMAL_SEPARATOR = ".";

    /**
     * Converts a double to String by rounding to defined decimal places.
     *
     * @param d A double to convert.
     * @param decimalPlaces Decimal places.
     *
     * @return Rounded number, as String.
     */
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