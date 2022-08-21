package consoleUtils;

import java.util.Objects;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ConsoleUtils {
    /**
     * Prints a line to console.
     *
     * @param line Line to print.
     */
    public static void printLine(@Nullable String line) {
        System.out.println(Objects.requireNonNullElse(line, ""));
    }

    /**
     * Prints a separator to console.
     */
    @SuppressWarnings("unused")
    public static void printSeparator() {
        printLine(separatorString());
    }

    public static @NotNull String separatorString() {
        String separatorPattern = "-";
        int separatorLength = 12;
        return separatorPattern.repeat(separatorLength);
    }
}