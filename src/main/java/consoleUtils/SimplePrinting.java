package consoleUtils;

import java.util.Objects;
import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
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

    //TODO: add javadoc
    public static void printLineArray(@Nullable String @Nullable [] lines) {
        if (lines != null) {
            for (@Nullable String line : lines) {
                printLine(line);
            }
        }
    }

    //TODO: add javadoc
    public static void printLineList(@Nullable List<@Nullable String> lines) {
        if (lines != null) {
            for (@Nullable String line : lines) {
                printLine(line);
            }
        }
    }
}