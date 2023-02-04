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
 */
public class MultiSectionBufferTest extends AbstractBufferTest {
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
        new MultiSectionBufferTest(new MultiSectionConsoleBuffer(TEST_SECTION_ARRAY));
        printLine("Testing section list:");
        new MultiSectionBufferTest(new MultiSectionConsoleBuffer(TEST_SECTION_LIST));
    }

    private static @Nullable BufferSection @NotNull [] getTestSectionArray() {
        return new BufferSection[] {
                getTestSection(TestSectionType.LINE_BY_LINE),
                getTestSection(TestSectionType.LINE_ARRAY),
                getTestSection(TestSectionType.LINE_LIST),
                getTestSection(TestSectionType.EMPTY),
                getTestSection(null),
        };
    }

    private static @NotNull List<@Nullable BufferSection> getTestSectionList() {
        return Arrays.asList(TEST_SECTION_ARRAY);
    }

    private MultiSectionBufferTest(@NotNull MultiSectionConsoleBuffer buffer) {
        super(buffer);
    }
}