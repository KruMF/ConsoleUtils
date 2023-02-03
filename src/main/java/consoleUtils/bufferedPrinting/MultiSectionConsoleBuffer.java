package consoleUtils.bufferedPrinting;

import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
public class MultiSectionConsoleBuffer extends AbstractConsoleBuffer {

    //TODO: add javadoc
    public MultiSectionConsoleBuffer(@Nullable BufferSection @NotNull [] sections) {
        super();
        addSectionArray(sections);
    }

    //TODO: add javadoc
    public MultiSectionConsoleBuffer(@NotNull List<@Nullable BufferSection> sections) {
        super();
        addSectionList(sections);
    }

    private void addSectionArray(@Nullable BufferSection @NotNull [] sections) {
        for (@Nullable BufferSection section : sections) {
            addSection(section);
        }
    }

    private void addSectionList(@NotNull List<@Nullable BufferSection> sections) {
        for (@Nullable BufferSection section : sections) {
            addSection(section);
        }
    }
}