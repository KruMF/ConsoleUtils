package bufferedPrintingTests;

import org.jetbrains.annotations.NotNull;

import consoleUtils.bufferedPrinting.AbstractConsoleBuffer;

//
abstract class AbstractBufferTest {
    private static final int NUMBER_OF_TEST_CYCLES = 3;

    //
    AbstractBufferTest() {
        //
    }

    //
    protected final void testBuffer(@NotNull AbstractConsoleBuffer buffer) {
        for (int i = 0; i < NUMBER_OF_TEST_CYCLES; i++) {
            buffer.print();
        }
    }
}