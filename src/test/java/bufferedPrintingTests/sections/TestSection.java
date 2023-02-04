package bufferedPrintingTests.sections;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import consoleUtils.bufferedPrinting.BufferSection;

/**
 * A buffer section for testing console buffers.
 */
public class TestSection extends BufferSection {
    private static final @NotNull Map<@NotNull TestSectionType, @NotNull String>
            TEST_SECTION_NAMES = new HashMap<>() {
        {
            put(TestSectionType.EMPTY, "empty");
            put(TestSectionType.LINE_BY_LINE, "line by line");
            put(TestSectionType.LINE_ARRAY, "line array");
            put(TestSectionType.LINE_LIST, "line list");
        }
    };

    private final @NotNull TestSectionType sectionType;
    private final int numberOfLines;

    /**
     * Creates a new console buffer test section with specified parameters.
     *
     * @param sectionType   Type of section.
     * @param numberOfLines Number of lines in this section.
     */
    public TestSection(@NotNull TestSectionType sectionType, int numberOfLines) {
        super();
        this.sectionType = sectionType;
        this.numberOfLines = numberOfLines;
    }

    /**
     * Gets the contents of this buffer section.
     * Override this to set the actual contents.
     */
    @Override
    public final void getContents() {
        if (sectionType != TestSectionType.EMPTY) {
            @NotNull String sectionName = TEST_SECTION_NAMES.get(sectionType);
            switch (sectionType) {
                case LINE_BY_LINE -> {
                    for (int i = 0; i < numberOfLines; i++) {
                        addLine(generateLine(sectionName, i + 1));
                    }
                }
                case LINE_ARRAY -> {
                    @Nullable String @NotNull [] lines = new String[numberOfLines];
                    for (int i = 0; i < numberOfLines; i++) {
                        lines[i] = generateLine(sectionName, i + 1);
                    }
                    addLineArray(lines);
                }
                case LINE_LIST -> {
                    @NotNull List<@Nullable String> lines = new ArrayList<>() {{
                        for (int i = 0; i < numberOfLines; i++) {
                            add(generateLine(sectionName, i + 1));
                        }
                    }};
                    addLineList(lines);
                }
                default -> {}
            }
        }
    }

    private @NotNull String generateLine(@NotNull String sectionName, int lineNumber) {
        return "Section: " + sectionName + ", line: " + lineNumber;
    }
}