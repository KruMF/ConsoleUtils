package consoleUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static consoleUtils.ConsoleUtils.printLine;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
abstract class AbstractConsoleBuffer {
    private static final String BLANK_LINE = "";
    private List<String> lines;

    //TODO: add javadoc
    protected AbstractConsoleBuffer() {
        prepareNewCycle();
    }

    private void prepareNewCycle() {
        lines = new ArrayList<>();
        addLines(header());
    }

    //TODO: add javadoc
    public @Nullable abstract List<String> header();

    //TODO: add javadoc
    public void addLine(@Nullable String line) {
        lines.add(Objects.requireNonNullElse(line, BLANK_LINE));
    }

    //TODO: add javadoc
    public void addLines(@Nullable List<String> lines) {
        List<String> nonNullLines = Objects.requireNonNullElse(lines, new ArrayList<String>());
        for (String line : nonNullLines) {
            addLine(line);
        }
    }

    //TODO: add javadoc
    public @Nullable abstract List<String> footer();

    //TODO: add javadoc
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