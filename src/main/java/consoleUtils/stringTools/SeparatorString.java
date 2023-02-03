package consoleUtils.stringTools;

import java.util.Objects;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A separator string for separating lines of text.
 */
public class SeparatorString {
    private static final @NotNull String DEFAULT_PATTERN = "-";
    private static final int DEFAULT_LENGTH = 12;
    private final @NotNull String string;

    /**
     * Creates a new separator string with default settings.
     */
    public SeparatorString() {
        this(null);
    }

    /**
     * Creates a new separator string. Repeats pattern as specified.
     *
     * @param pattern Pattern to repeat. (Null - default)
     * @param length  Times to repeat the pattern.
     */
    public SeparatorString(@Nullable String pattern, int length) {
        this(assembleString(pattern, length));
    }

    /**
     * Creates a new custom separator string.
     *
     * @param separator The string of the separator. (Null - default)
     */
    public SeparatorString(@Nullable String separator) {
        string = Objects.requireNonNullElse(separator, getDefaultString());
    }

    private static @NotNull String getDefaultString() {
        return assembleString(null, DEFAULT_LENGTH);
    }

    private static String assembleString(@Nullable String pattern, int length) {
        return (Objects.requireNonNullElse(pattern, DEFAULT_PATTERN)).repeat(Math.max(0, length));
    }

    /**
     * Gets the separator string.
     *
     * @return The string of the separator.
     */
    public final @NotNull String getString() {
        return string;
    }
}