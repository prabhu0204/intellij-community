import java.util.function.Consumer;
import java.util.stream.Stream;

public class Bar {
  public static void main(String[] args) {
    final long count = Stream.of("abc", "ac<caret>d", "ef").map(String::length).filter(x -> x % 2 == 0).count();
  }
}
