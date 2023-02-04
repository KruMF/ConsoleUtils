package stringToolsTests;

import java.util.List;
import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static consoleUtils.SimplePrinting.printLineList;
import consoleUtils.stringTools.SeparatorString;

/**
 * Testing separator strings.
 */
public class SeparatorStringTest {
    private static final @NotNull String
            REPEATABLE_PATTERN = "abc ",
            CUSTOM_SEPARATOR = "custom";
    private static final int PATTERN_LENGTH = 3;

    /**
     * Main method of this test.
     * Run this to start.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        @NotNull List<@Nullable String> lines = new ArrayList<>() {{
            add(getDefaultSeparator().getString());
            add(null);
            add(getRepeatingNullSeparator().getString());
            add(null);
            add(getRepeatingPatternSeparator().getString());
            add(null);
            add(getCustomSeparator().getString());
        }};
        printLineList(lines);
    }

    private static @NotNull SeparatorString getDefaultSeparator() {
        return new SeparatorString();
    }

    private static @NotNull SeparatorString getRepeatingNullSeparator() {
        return new SeparatorString(null, PATTERN_LENGTH);
    }

    private static @NotNull SeparatorString getRepeatingPatternSeparator() {
        return new SeparatorString(REPEATABLE_PATTERN, PATTERN_LENGTH);
    }

    private static @NotNull SeparatorString getCustomSeparator() {
        return new SeparatorString(CUSTOM_SEPARATOR);
    }
}