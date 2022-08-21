package numberFormatterTest;

import consoleUtils.ConsoleBuffer;

import java.util.ArrayList;
import java.util.List;

import static consoleUtils.ConsoleUtils.separatorString;
import static consoleUtils.NumberFormatter.doubleToString;

/**
 * Testing text formatter with console buffer.
 */
public class NumberFormatterTest {
    private static final String TEST_NAME = "Number formatter test";

    private static ConsoleBuffer consoleBuffer = new ConsoleBuffer() {
        @Override
        public List<String> header() {
            return new ArrayList<>() {{
                add(TEST_NAME + ":");
                add(null);
            }};
        }
    };

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
        addLine(doubleToString(d1,2));
        addLine(doubleToString(d1,3));
        addLine(doubleToString(d1,4));
        addLine(separatorString());
        addLine(doubleToString(d2,0));
        addLine(doubleToString(d2,4));
        addLine(separatorString());
        addLine(doubleToString(d3,0));
        addLine(doubleToString(d3,2));
        consoleBuffer.print();
    }

    private static void addLine(String line) {
        consoleBuffer.addLine(line);
    }
}