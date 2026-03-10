package LambdaIzrazi.Collect;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OsnovnaCollectOperacija {
    static void main() {
        List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());
    }
}
