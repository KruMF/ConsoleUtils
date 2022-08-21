package consoleUtils;

import java.util.List;

import org.jetbrains.annotations.Nullable;

/**
 * A console buffer for printing lines to console synchronously.
 */
public class ConsoleBuffer extends AbstractConsoleBuffer {

    /**
     * Creates a new ConsoleBuffer object.
     */
    public ConsoleBuffer() {
        super();
    }

    /**
     * Header to be prepended at the beginning of each cycle.
     * Override this to add a header.
     *
     * @return Header as a list of lines.
     */
    @Override
    public @Nullable List<String> header() {
        return null;
    }

    /**
     * Adds a line to the buffer.
     *
     * @param line Line to add.
     */
    @Override
    public final void addLine(@Nullable String line) {
        super.addLine(line);
    }

    /**
     * Adds a list of lines to the buffer.
     *
     * @param lines List of lines to add.
     */
    @Override
    public final void addLines(@Nullable List<String> lines) {
        super.addLines(lines);
    }

    /**
     * Footer to be appended at the end of each cycle.
     * Override this to add a footer.
     *
     * @return Footer as a list of lines.
     */
    @Override
    public @Nullable List<String> footer() {
        return null;
    }

    /**
     * Prints contents to console and prepares for a new cycle.
     */
    @Override
    public final void print() {
        super.print();
    }
}