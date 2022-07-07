package numberFormatterTest;

import static consoleUtils.ConsoleUtils.*;
import static consoleUtils.NumberFormatter.doubleToString;

/**
 * Testing text formatting.
 */
public class NumberFormatterTest {
    private static final double
            d1 = 7.007,
            d2 = 12341234.1234,
            d3 = 0.1;

    /**
     * Main method of this test.
     * Run this to start.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        printLine(doubleToString(d1,2));
        printLine(doubleToString(d1,3));
        printLine(doubleToString(d1,4));
        separator();
        printLine(doubleToString(d2,0));
        printLine(doubleToString(d2,4));
        separator();
        printLine(doubleToString(d3,0));
        printLine(doubleToString(d3,2));
    }
}