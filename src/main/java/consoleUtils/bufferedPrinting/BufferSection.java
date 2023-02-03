package consoleUtils.bufferedPrinting;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static consoleUtils.SimplePrinting.printLineList;
import consoleUtils.stringTools.SeparatorString;

//TODO: add javadocs
public abstract class BufferSection {
    private final @NotNull List<@Nullable String> lines;
    private final @NotNull String separator;

    //TODO: add javadoc
    public BufferSection() {
        this(null);
    }

    //TODO: add javadoc
    public BufferSection(@Nullable SeparatorString separator) {
        lines = new ArrayList<>();
        this.separator = (Objects.requireNonNullElse(separator, new SeparatorString())).getString();
    }

    //TODO: add javadoc
    protected final void setContents() {
        addLine(separator);
        getContents();
    }

    //TODO: add javadoc
    public abstract void getContents();

    //TODO: add javadoc
    public final void addLine(@Nullable String line) {
        lines.add(line);
    }

    //TODO: add javadoc
    public final void addLineArray(@Nullable String @Nullable [] lines) {
        if (lines != null) {
            for (@Nullable String line : lines) {
                addLine(line);
            }
        }
    }

    //TODO: add javadoc
    public final void addLineList(@Nullable List<@Nullable String> lines) {
        if (lines != null) {
            for (@Nullable String line : lines) {
                addLine(line);
            }
        }
    }

    //TODO: add javadoc
    protected final void print() {
        printLineList(lines);
    }

    //TODO: add javadoc
    protected final void clear() {
        lines.clear();
    }
}