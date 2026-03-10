package Generics.Course.example5;

import Generics.Course.example6.QueryList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        int studentCount = 10;
        List<Student> students = new ArrayList<>();

        for (int i=0;i<studentCount;i++){
            students.add(new Student());
        }
        students.add(new LPAStudent());
        printMoreLists(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();

        for (int i=0;i<studentCount;i++){
            lpaStudents.add(new LPAStudent());
        }
       // printList(lpaStudents);
        printMoreLists(lpaStudents);


        testList(new ArrayList<>(List.of("Able","Barry","Charlie")));
        testList(new ArrayList<>(List.of(1,2,3)));


        QueryList<LPAStudent> queryList = new QueryList<>(lpaStudents);
        List<LPAStudent> matches = queryList.getMatches("course","Python");
        System.out.println();
        printList(matches);

    }
    public static<T extends Student> void printList(List<T> students){

        for(var student:students){
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }
    public static void printMoreLists(List<? extends Student> students){
        Student last = new Student();
        for(var student:students){
            System.out.println(student);
        }
        System.out.println();
    }


    public static void testList(List<?> list){
        for(Object element:list){
            if(element instanceof String s){
                System.out.println("String: " + s.toUpperCase());
            }
            else if(element instanceof Integer i){
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }
//
//    public static void testList(List<String> list){
//        for (var element:list){
//            System.out.println("String: " + element );
//        }
//    }
//    public static void testList(List<Integer> list){
//        for (var element:list){
//            System.out.println("Integer: " + element.floatValue());
//        }
//    }
}
