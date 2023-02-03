package numberFormatterTest;

import java.util.List;
import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

import static consoleUtils.stringTools.NumberFormatter.doubleToString;

import consoleUtils.stringTools.SeparatorString;
import consoleUtils.ConsoleBuffer;

/**
 * Testing text formatter with console buffer.
 */
public class NumberFormatterTest {
    private static final String TEST_NAME = "Number formatter test";

    private static final ConsoleBuffer consoleBuffer = new ConsoleBuffer() {
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
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        @NotNull SeparatorString separator = new SeparatorString();

        addLine(doubleToString(d1,2));
        addLine(doubleToString(d1,3));
        addLine(doubleToString(d1,4));
        addLine(separator.getString());
        addLine(doubleToString(d2,0));
        addLine(doubleToString(d2,4));
        addLine(separator.getString());
        addLine(doubleToString(d3,0));
        addLine(doubleToString(d3,2));

        consoleBuffer.print();
    }

    private static void addLine(String line) {
        consoleBuffer.addLine(line);
    }
}