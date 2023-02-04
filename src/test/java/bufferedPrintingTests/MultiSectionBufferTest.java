package bufferedPrintingTests;

import java.util.Arrays;
import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static consoleUtils.SimplePrinting.printLine;
import consoleUtils.bufferedPrinting.BufferSection;
import consoleUtils.bufferedPrinting.MultiSectionConsoleBuffer;

import bufferedPrintingTests.sections.*;

/**
 * Testing multi-section console buffer.
 * TODO: finish this
 */
public class MultiSectionBufferTest {
    private static final int
            SECTION_LENGTH = 3,
            NUMBER_OF_TEST_CYCLES = 3;
    private static final @Nullable BufferSection @NotNull []
            TEST_SECTION_ARRAY = getTestSectionArray();
    private static final @NotNull List<@Nullable BufferSection>
            TEST_SECTION_LIST = getTestSectionList();

    /**
     * Main method of this test.
     * Run this to start.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        printLine("Testing section array:");
        testBuffer(new MultiSectionConsoleBuffer(TEST_SECTION_ARRAY));
        printLine("Testing section list:");
        testBuffer(new MultiSectionConsoleBuffer(TEST_SECTION_LIST));
    }

    private static @Nullable BufferSection @NotNull [] getTestSectionArray() {
        return new BufferSection[] {
                new TestSection(TestSectionType.LINE_BY_LINE, SECTION_LENGTH),
                new TestSection(TestSectionType.LINE_ARRAY, SECTION_LENGTH),
                new TestSection(TestSectionType.LINE_LIST, SECTION_LENGTH),
                new TestSection(TestSectionType.EMPTY, SECTION_LENGTH),
                null
        };
    }

    private static @NotNull List<@Nullable BufferSection> getTestSectionList() {
        return Arrays.asList(TEST_SECTION_ARRAY);
    }

    private static void testBuffer(@NotNull MultiSectionConsoleBuffer buffer) {
        for (int i = 0; i < NUMBER_OF_TEST_CYCLES; i++) {
            buffer.print();
        }
    }
}