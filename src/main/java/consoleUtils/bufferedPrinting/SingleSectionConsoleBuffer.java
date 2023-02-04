package consoleUtils.bufferedPrinting;

import org.jetbrains.annotations.Nullable;

/**
 * A single-section console buffer for printing lines to console.
 */
public class SingleSectionConsoleBuffer extends AbstractConsoleBuffer {

    /**
     * Creates a new single-section console buffer.
     *
     * @param section The buffer section.
     */
    public SingleSectionConsoleBuffer(@Nullable BufferSection section) {
        super();
        addSection(section);
    }
}