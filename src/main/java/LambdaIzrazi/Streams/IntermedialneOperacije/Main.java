package LambdaIzrazi.Streams.IntermedialneOperacije;

import java.util.stream.IntStream;

public class Main {
    static void main() {
        IntStream.iterate((int)'A',i->i<=(int) 'z',i->i+1)
                .filter(Character::isAlphabetic)
                .map(Character::toUpperCase)
                .distinct()
                //.takeWhile(i->i<'a') // uzima do prvog false onda se prekine
                //.dropWhile(i->Character.toUpperCase(i)<='E') // odbacuje toliko dugo dok nedodje do prvog false-a onda kreće uzimati
                //.skip(5)
                //.filter(i->Character.toUpperCase(i)>'E')
                .forEach(d-> System.out.printf("%c ",d));
    }
}
