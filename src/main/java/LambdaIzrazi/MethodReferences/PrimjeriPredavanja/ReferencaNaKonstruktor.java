package LambdaIzrazi.MethodReferences.PrimjeriPredavanja;

import java.util.List;

class User{
    private String name;
    public User(String name){
        this.name = name;
    }
}
public class ReferencaNaKonstruktor {
    static void main() {
        // Kreiranje User objekata
        List<String> usernames = List.of("alice", "bob", "charlie");

        // Lambda:
        usernames.stream().map(s->new User(s));

        // Method reference:
        usernames.stream().map(User::new);
    }
}
