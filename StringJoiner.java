class StringJoiner {

  private final String delimiter;

  StringJoiner(String delimiter) {
    this.delimiter = delimiter;
  }
  
  String join(String left, String right) {
    return left + joiner + right;
  }
}
