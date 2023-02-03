package consoleUtils.bufferedPrinting;

import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
public class SingleSectionConsoleBuffer extends AbstractConsoleBuffer {
    //TODO: add javadoc
    public SingleSectionConsoleBuffer(@Nullable BufferSection section) {
        super();
        addSection(section);
    }
}