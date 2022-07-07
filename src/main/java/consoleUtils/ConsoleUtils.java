package consoleUtils;

import java.text.DecimalFormat;
import java.util.Objects;

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
    public static void separator() {
        printLine("-".repeat(12));
    }
}