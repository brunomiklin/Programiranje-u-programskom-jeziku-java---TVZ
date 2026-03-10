package LambdaIzrazi.Collect;

import java.util.List;
import java.util.stream.Stream;

public class ModerneCollectOpcije {
    static void main() {
        // Java 16+ jednostvna sintaksa

        List<String> collected = Stream.of("a", "b", "c").toList();
    }
}
