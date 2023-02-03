package consoleUtils.stringTools;

import java.text.DecimalFormat;

import org.jetbrains.annotations.NotNull;

/**
 * A number formatter for rounding doubles.
 */
public class NumberFormatter {
    private static final @NotNull String
            NUMBER_SYMBOL = "#",
            DECIMAL_SEPARATOR = ".";

    /**
     * Converts a double to String by rounding to defined decimal places.
     *
     * @param d A double to convert.
     * @param decimalPlaces Decimal places.
     *
     * @return Rounded number as a String.
     */
    public static @NotNull String doubleToString(double d, int decimalPlaces) {
        return getDecimalFormat(decimalPlaces).format(d);
    }

    private static @NotNull DecimalFormat getDecimalFormat(int decimalPlaces) {
        @NotNull StringBuilder formatStringBuilder = new StringBuilder(NUMBER_SYMBOL);
        if (decimalPlaces > 0) {
            formatStringBuilder.append(DECIMAL_SEPARATOR);
            formatStringBuilder.append(NUMBER_SYMBOL.repeat(decimalPlaces));
        }
        return new DecimalFormat(formatStringBuilder.toString());
    }
}