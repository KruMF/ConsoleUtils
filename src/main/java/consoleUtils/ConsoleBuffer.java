package consoleUtils;

import java.util.List;

import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
public class ConsoleBuffer extends AbstractConsoleBuffer {
    //TODO: add javadoc
    public ConsoleBuffer() {
        super();
    }

    //TODO: add javadoc
    @Override
    public @Nullable List<String> header() {
        return null;
    }

    //TODO: add javadoc
    @Override
    public final void addLine(@Nullable String line) {
        super.addLine(line);
    }

    //TODO: add javadoc
    @Override
    public final void addLines(@Nullable List<String> lines) {
        super.addLines(lines);
    }

    //TODO: add javadoc
    @Override
    public @Nullable List<String> footer() {
        return null;
    }

    //TODO: add javadoc
    @Override
    public final void print() {
        super.print();
    }
}