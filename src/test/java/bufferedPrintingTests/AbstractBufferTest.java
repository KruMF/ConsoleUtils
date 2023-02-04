package bufferedPrintingTests;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import consoleUtils.bufferedPrinting.AbstractConsoleBuffer;

import bufferedPrintingTests.sections.*;

//TODO: add javadocs
abstract class AbstractBufferTest {
    private static final int
            NUMBER_OF_TEST_CYCLES = 3,
            SECTION_LENGTH = 3;

    //TODO: add javadoc
    protected AbstractBufferTest(@NotNull AbstractConsoleBuffer buffer) {
        testBuffer(buffer);
    }

    private void testBuffer(@NotNull AbstractConsoleBuffer buffer) {
        for (int i = 0; i < NUMBER_OF_TEST_CYCLES; i++) {
            buffer.print();
        }
    }

    //TODO: add javadoc
    protected static @Nullable TestSection getTestSection(@Nullable TestSectionType sectionType) {
        if (sectionType == null) {
            return null;
        } else {
            return new TestSection(sectionType, SECTION_LENGTH);
        }
    }
}