package stringToolsTests;

import java.util.List;
import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static consoleUtils.SimplePrinting.printLineList;
import static consoleUtils.stringTools.NumberFormatter.doubleToString;

/**
 * Testing number formatter.
 */
public class NumberFormatterTest {
    private static final double UNFORMATTED_DOUBLE = 123456.123456;
    private static final int @NotNull [] DECIMAL_PLACES_RANGE = new int[] {-2, 8};
    private static final @NotNull String COMMON_INDICATOR_STRING = "Decimal places: ";

    /**
     * Main method of this test.
     * Run this to start.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        @NotNull List<@Nullable String> lines = new ArrayList<>() {{
            for (int i = DECIMAL_PLACES_RANGE[1]; i >= DECIMAL_PLACES_RANGE[0]; i--) {
                add(null);
                add(getIndicatorString(i));
                add(getFormattedNumber(i));
            }
        }};
        printLineList(lines);
    }

    private static @NotNull String getIndicatorString(int decimalPlaces) {
        return COMMON_INDICATOR_STRING + decimalPlaces;
    }

    private static @NotNull String getFormattedNumber(int decimalPlaces) {
        return doubleToString(UNFORMATTED_DOUBLE, decimalPlaces);
    }
}