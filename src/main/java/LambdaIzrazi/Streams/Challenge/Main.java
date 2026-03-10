package LambdaIzrazi.Streams.Challenge;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Course pymc= new Course("PYMC", "Python Masterclass");
        Course jmc= new Course("JMC", "Java Masterclass");

        Stream.generate(() -> Student.getRandomStudent(jmc, pymc))
                .limit(10);

        List<Student> students = Stream.generate(()->Student.getRandomStudent(jmc,pymc))
                .limit(1000).toList();

        students.forEach(System.out::println);



         List<Student> maleStudents = students.stream().filter(s->s.getGender().equals("M")).toList();
        System.out.println("# of male students " + maleStudents.size());

        List<Student> femaleStudents = students.stream().filter(s->s.getGender().equals("F")).toList();
        System.out.println("# of female students " + femaleStudents.size());

        List<Student> unisex = students.stream().filter(s->s.getGender().equals("U")).toList();
        System.out.println("# of unisex students " + unisex.size());


        Map<String,Long> poDobnimSkupinama = students.stream().collect(Collectors.groupingBy(s->{
            if(s.getAge()<30) return "<  30";
            else if(s.getAge()>=30 && s.getAge()<=60) return ">= 30 and <=60";
           return "> 60";
        }
        ,Collectors.counting()));


        for (String s:poDobnimSkupinama.keySet()){
            System.out.println(s + " " + poDobnimSkupinama.get(s));
        }

    }
}
