package consoleUtils.bufferedPrinting;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static consoleUtils.SimplePrinting.printLineList;
import consoleUtils.stringTools.SeparatorString;

/**
 * A section for console buffers.
 */
public abstract class BufferSection {
    private final @NotNull List<@Nullable String> lines;
    private final @NotNull String separator;

    /**
     * Creates a new buffer section with a default separator.
     */
    public BufferSection() {
        this(null);
    }

    /**
     * Creates a new buffer section with a custom separator.
     *
     * @param separator Section separator. (Null - default)
     */
    public BufferSection(@Nullable SeparatorString separator) {
        lines = new ArrayList<>();
        @NotNull SeparatorString nonNullSeparator = Objects.requireNonNullElse(separator, new SeparatorString());
        this.separator = nonNullSeparator.getString();
    }

    /**
     * Adds a separator and sets the contents for this buffer section.
     */
    protected final void setContents() {
        addLine(separator);
        getContents();
    }

    /**
     * Gets the contents of this buffer section.
     * Override this to set the actual contents.
     */
    public abstract void getContents();

    /**
     * Adds a line to this buffer section.
     *
     * @param line Line to add. (Null - empty line)
     */
    public final void addLine(@Nullable String line) {
        lines.add(line);
    }

    /**
     * Adds an array of lines to this buffer section.
     *
     * @param lines Lines to add. (Null array - doesn't add; null line - adds a blank line)
     */
    public final void addLineArray(@Nullable String @Nullable [] lines) {
        if (lines != null) {
            for (@Nullable String line : lines) {
                addLine(line);
            }
        }
    }

    /**
     * Adds a list of lines to this buffer section.
     *
     * @param lines Lines to add. (Null list - doesn't add; null line - adds a blank line)
     */
    public final void addLineList(@Nullable List<@Nullable String> lines) {
        if (lines != null) {
            for (@Nullable String line : lines) {
                addLine(line);
            }
        }
    }

    /**
     * Prints all lines.
     */
    protected final void print() {
        printLineList(lines);
    }

    /**
     * Clears all lines.
     */
    protected final void clear() {
        lines.clear();
    }
}