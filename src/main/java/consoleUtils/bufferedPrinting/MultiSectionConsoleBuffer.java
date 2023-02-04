package consoleUtils.bufferedPrinting;

import java.util.List;

import org.jetbrains.annotations.Nullable;

/**
 * A multi-section console buffer for printing lines to console.
 */
public class MultiSectionConsoleBuffer extends AbstractConsoleBuffer {

    /**
     * Creates a new multi-section console buffer.
     *
     * @param sections An array of initial buffer sections. (Null array - empty buffer)
     */
    public MultiSectionConsoleBuffer(@Nullable BufferSection @Nullable [] sections) {
        super();
        addSectionArray(sections);
    }

    /**
     * Creates a new multi-section console buffer.
     *
     * @param sections A list of initial buffer sections. (Null list - empty buffer)
     */
    public MultiSectionConsoleBuffer(@Nullable List<@Nullable BufferSection> sections) {
        super();
        addSectionList(sections);
    }

    /**
     * Adds additional section to this console buffer.
     *
     * @param section Section to add. (Null - doesn't add)
     */
    @Override
    public final void addSection(@Nullable BufferSection section) {
        super.addSection(section);
    }

    /**
     * Adds an array of additional sections to this console buffer.
     *
     * @param sections Array of sections to add. (Null - doesn't add)
     */
    public final void addSectionArray(@Nullable BufferSection @Nullable [] sections) {
        if (sections != null) {
            for (@Nullable BufferSection section : sections) {
                addSection(section);
            }
        }
    }

    /**
     * Adds a list of additional sections to this console buffer.
     *
     * @param sections List of sections to add. (Null - doesn't add)
     */
    public final void addSectionList(@Nullable List<@Nullable BufferSection> sections) {
        if (sections != null) {
            for (@Nullable BufferSection section : sections) {
                addSection(section);
            }
        }
    }
}