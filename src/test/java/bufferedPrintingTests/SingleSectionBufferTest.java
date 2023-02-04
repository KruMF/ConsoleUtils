package bufferedPrintingTests;

import org.jetbrains.annotations.NotNull;

import consoleUtils.bufferedPrinting.SingleSectionConsoleBuffer;

import bufferedPrintingTests.sections.*;

/**
 * Testing single-section console buffer.
 */
public class SingleSectionBufferTest extends AbstractBufferTest {
    private static final @NotNull TestSectionType SECTION_TYPE = TestSectionType.LINE_BY_LINE;

    /**
     * Main method of this test.
     * Run this to start.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        new SingleSectionBufferTest(new SingleSectionConsoleBuffer(getTestSection(SECTION_TYPE)));
    }

    private SingleSectionBufferTest(@NotNull SingleSectionConsoleBuffer buffer) {
        super(buffer);
    }
}