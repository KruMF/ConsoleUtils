# Console Utilities

[![](https://jitpack.io/v/Krumuvecis/ConsoleUtils.svg)](https://jitpack.io/#Krumuvecis/ConsoleUtils)


## Abstract

Common methods and classes for printing stuff in console. See functionality and requirements below.

by [Krumuvecis](https://github.com/Krumuvecis)


## Requirements

* JDK: 21
* Maven compiler: 21
* [JetBrains Java Annotations](https://mvnrepository.com/artifact/org.jetbrains/annotations) : 24.1.0


## Functionality

### Simple printing

Using `consoleUtils.SimplePrinting`
* Print a single line:
  ```
  static void printLine(@Nullable String line)
  ```
* Print an array of lines:
  ```
  static void printLineArray(@Nullable String @Nullable [] lines)
  ```
* Print a list of lines:
  ```
  static void printLineList(@Nullable List<@Nullable String> lines)
  ```

### String tools

* Number formatting using `consoleUtils.stringTools.NumberFormatter`
  ```
  static @NotNull String doubleToString(double d, int decimalPlaces)
  ```

* Separator string for separating lines of text using `consoleUtils.stringTools.SeparatorString`
  * 3 constructors available:
    ```
    SeparatorString()
    SeparatorString(@Nullable String pattern, int length)
    SeparatorString(@Nullable String separator)
    ```
  * Get the separator string by calling:
    ```
    @NotNull String getString()
    ```


### Buffered printing

Print multiple lines of text in console using `consoleUtils.bufferedPrinting`.

Lines of a buffer are grouped into sections; each section starts with a separator.

Each print cycle of a buffer gets new lines for sections, prints all lines,
and clears all lines afterwards, for dynamic line updatability.

Base section `BufferSection` is abstract and must be extended:
* Must override method:
  ```
  abstract void getContents()
  ```
* 2 constructors available:
  ```
  BufferSection()
  BufferSection(@Nullable SeparatorString separator)
  ```

2 buffer types available:
* Single-section buffer:
  ```
  SingleSectionConsoleBuffer(@Nullable BufferSection section)
  ```
* Multi-section buffer:
  ```
  MultiSectionConsoleBuffer(@Nullable BufferSection @Nullable [] sections)
  MultiSectionConsoleBuffer(@Nullable List<@Nullable BufferSection> sections)
  
  void addSection(@Nullable BufferSection section)
  void addSectionArray(@Nullable BufferSection @Nullable [] sections)
  void addSectionList(@Nullable List<@Nullable BufferSection> sections)
  ```

Perform a print cycle on a buffer by calling:
```
void print()
```


## Notes

Strongly recommended to use the latest release.

Releases available [here](https://github.com/KruMF/ConsoleUtils/releases).