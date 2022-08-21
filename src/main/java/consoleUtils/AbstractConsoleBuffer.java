package consoleUtils;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

import static consoleUtils.ConsoleUtils.printLine;

import org.jetbrains.annotations.Nullable;

/**
 * An abstract console buffer for printing lines to console synchronously.
 */
abstract class AbstractConsoleBuffer {
    private static final String BLANK_LINE = "";
    private List<String> lines;

    /**
     * Creates a new AbstractConsoleBuffer object.
     */
    protected AbstractConsoleBuffer() {
        prepareNewCycle();
    }

    private void prepareNewCycle() {
        lines = new ArrayList<>();
        addLines(header());
    }

    /**
     * Header to be prepended at the beginning of each cycle.
     * Override this to add a header.
     *
     * @return Header as a list of lines.
     */
    public @Nullable abstract List<String> header();

    /**
     * Adds a line to the buffer.
     *
     * @param line Line to add.
     */
    public void addLine(@Nullable String line) {
        lines.add(Objects.requireNonNullElse(line, BLANK_LINE));
    }

    /**
     * Adds a list of lines to the buffer.
     *
     * @param lines List of lines to add.
     */
    public void addLines(@Nullable List<String> lines) {
        List<String> nonNullLines = Objects.requireNonNullElse(lines, new ArrayList<String>());
        for (String line : nonNullLines) {
            addLine(line);
        }
    }

    /**
     * Footer to be appended at the end of each cycle.
     * Override this to add a footer.
     *
     * @return Footer as a list of lines.
     */
    public @Nullable abstract List<String> footer();

    /**
     * Prints contents to console and prepares for a new cycle.
     */
    public void print() {
        addLines(footer());
        printLines();
        prepareNewCycle();
    }

    private void printLines() {
        for (String line : lines) {
            printLine(line);
        }
    }
}