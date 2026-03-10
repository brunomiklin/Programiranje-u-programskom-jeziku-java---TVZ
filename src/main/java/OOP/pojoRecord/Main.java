package OOP.pojoRecord;


public class Main {
    static void main() {

        for(int i=1;i<=5;i++){
            StudentPOJO s = new StudentPOJO("S92300" + i,
                    switch (i){
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Leda";
                case 4->"Bruno";
                case 5->"Niko";
                        default -> "Nepoznat";
                    },"05/11/1985","Java masterclass");
            //System.out.println(s);
        }


        StudentPOJO pojo = new StudentPOJO("S923006","Ann","05/11/1985","Java masterclass");
        StudentRECORD record = new StudentRECORD("S923007","Bill","05/11/1985","Java masterclass");

        System.out.println(pojo);
        System.out.println(record);

        pojo.setClassList(pojo.getClassList() + ", JAVA OCP Exam 829");
        //record.setClassList(pojo.getClassList() + ", JAVA OCP Exam 829"); --> setter ne postoji unutar record-a jer je record immutable

        System.out.println(pojo.getName()); // getName()
        System.out.println(record.name()); // name()
    }
}
