package bufferedPrintingTests;

import org.jetbrains.annotations.NotNull;

import consoleUtils.bufferedPrinting.SingleSectionConsoleBuffer;

import bufferedPrintingTests.sections.*;

/**
 * Testing single-section console buffer.
 * TODO: finish this
 */
public class SingleSectionBufferTest {
    private static final @NotNull TestSectionType SECTION_TYPE = TestSectionType.LINE_BY_LINE;
    private static final int
            SECTION_LENGTH = 3,
            NUMBER_OF_TEST_CYCLES = 3;
    private static final @NotNull TestSection TEST_SECTION = new TestSection(SECTION_TYPE, SECTION_LENGTH);

    /**
     * Main method of this test.
     * Run this to start.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        @NotNull SingleSectionConsoleBuffer buffer = new SingleSectionConsoleBuffer(TEST_SECTION);
        for (int i = 0; i < NUMBER_OF_TEST_CYCLES; i++) {
            buffer.print();
        }
    }
}