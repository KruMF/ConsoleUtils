package bufferedPrintingTests;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import consoleUtils.bufferedPrinting.BufferSection;
import consoleUtils.bufferedPrinting.AbstractConsoleBuffer;

import bufferedPrintingTests.sections.*;

/**
 * An abstract console buffer test containing common functionality.
 */
abstract class AbstractBufferTest {
    private static final int
            NUMBER_OF_TEST_CYCLES = 3,
            SECTION_LENGTH = 3;

    /**
     * Creates a new abstract buffer test and tests the provided console buffer.
     *
     * @param buffer Abstract console buffer to test.
     */
    protected AbstractBufferTest(@NotNull AbstractConsoleBuffer buffer) {
        testBuffer(buffer);
    }

    private void testBuffer(@NotNull AbstractConsoleBuffer buffer) {
        for (int i = 0; i < NUMBER_OF_TEST_CYCLES; i++) {
            buffer.print();
        }
    }

    /**
     * Prepares a new buffer section for testing console buffers.
     *
     * @param sectionType Type of section. (Null - returns null)
     *
     * @return Buffer section of desired type.
     */
    protected static @Nullable BufferSection getTestSection(@Nullable TestSectionType sectionType) {
        if (sectionType == null) {
            return null;
        } else {
            return new TestSection(sectionType, SECTION_LENGTH);
        }
    }
}