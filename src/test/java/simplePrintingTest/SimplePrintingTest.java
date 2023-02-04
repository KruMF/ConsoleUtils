package simplePrintingTest;

import java.util.List;
import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static consoleUtils.SimplePrinting.*;

/**
 * Testing simple console printing.
 */
public class SimplePrintingTest {
    private static final @NotNull String
            COMMON_TEST_STRING = "Testing: ",
            TEST_STRING_PRINT_LINE = "single line",
            TEST_STRING_PRINT_ARRAY = "array of lines ",
            TEST_STRING_NULL_ARRAY = "Testing null array:",
            TEST_STRING_PRINT_LIST = "list of lines ",
            TEST_STRING_NULL_LIST = "Testing null list:";
    private static final int TEST_COLLECTION_SIZE = 3;

    /**
     * Main method of this test.
     * Run this to start.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        testSingleLine();
        testArrayPrinting();
        testListPrinting();
    }

    private static void printBlankLine() {
        printLine(null);
    }

    private static void testSingleLine() {
        printLine(COMMON_TEST_STRING + TEST_STRING_PRINT_LINE);
    }

    private static void testArrayPrinting() {
        printBlankLine();
        testLineArray();

        printBlankLine();
        printLine(TEST_STRING_NULL_ARRAY);
        testNullArray();
    }

    private static void testLineArray() {
        @Nullable String @NotNull [] lines = new String[TEST_COLLECTION_SIZE];
        for (int i = 0; i < TEST_COLLECTION_SIZE; i++) {
            lines[i] = COMMON_TEST_STRING + TEST_STRING_PRINT_ARRAY + i;
        }
        printLineArray(lines);
    }

    private static void testNullArray() {
        printLineArray(null);
    }

    private static void testListPrinting() {
        printBlankLine();
        testLineList();

        printBlankLine();
        printLine(TEST_STRING_NULL_LIST);
        testNullList();
    }

    private static void testLineList() {
        @NotNull List<@Nullable String> lines = new ArrayList<>() {{
            for (int i = 0; i < TEST_COLLECTION_SIZE; i++) {
                add(COMMON_TEST_STRING + TEST_STRING_PRINT_LIST + i);
            }
        }};
        printLineList(lines);
    }

    private static void testNullList() {
        printLineList(null);
    }
}