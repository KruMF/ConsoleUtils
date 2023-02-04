package consoleUtils.bufferedPrinting;

import java.util.List;
import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An abstract console buffer for printing lines to console.
 */
public abstract class AbstractConsoleBuffer {
    private final @NotNull List<@Nullable BufferSection> sections;

    /**
     * Creates a new abstract console buffer.
     */
    protected AbstractConsoleBuffer() {
        sections = new ArrayList<>();
    }

    /**
     * Adds a BufferSection object to this console buffer.
     *
     * @param section Buffer section to add.
     */
    protected void addSection(@Nullable BufferSection section) {
        sections.add(section);
    }

    /**
     * Call this for a complete print cycle.
     * Sets contents, prints to console, then clears contents.
     */
    public final void print() {
        for (@Nullable BufferSection section : sections) {
            if (section != null) {
                section.setContents();
                section.print();
                section.clear();
            }
        }
    }
}