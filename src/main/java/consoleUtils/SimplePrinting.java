package consoleUtils;

import java.util.Objects;
import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A class containing common static console-printing methods.
 */
public class SimplePrinting {
    private static final @NotNull String NON_NULL_STRING = "";

    /**
     * Prints a line to console.
     *
     * @param line Line to print.
     */
    public static void printLine(@Nullable String line) {
        System.out.println(Objects.requireNonNullElse(line, NON_NULL_STRING));
    }

    /**
     * Prints an array of lines to console.
     *
     * @param lines Lines to print. (Null - doesn't print)
     */
    public static void printLineArray(@Nullable String @Nullable [] lines) {
        if (lines != null) {
            for (@Nullable String line : lines) {
                printLine(line);
            }
        }
    }

    /**
     * Prints a list of lines to console.
     *
     * @param lines Lines to print. (Null - doesn't print)
     */
    public static void printLineList(@Nullable List<@Nullable String> lines) {
        if (lines != null) {
            for (@Nullable String line : lines) {
                printLine(line);
            }
        }
    }
}