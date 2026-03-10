package OOP.builderpattern;

public class Student {
    private final String oib;
    private final String ime;
    private final String prezime;
    private final String email;
    private final String mobitel;
    private final String grad;
    private final double prosjek;

    public Student(StudentBuilder builder){
        this.oib = builder.oib;
        this.ime = builder.ime;
        this.prezime = builder.prezime;
        this.email = builder.email;
        this.mobitel = builder.mobitel;
        this.grad = builder.grad;
        this.prosjek = builder.prosjek;
    }


    public static class StudentBuilder{

        private String oib="";
        private String ime="";
        private String prezime="";
        private String email="";
        private String mobitel="";
        private String grad="";
        private double prosjek=0;

        public StudentBuilder(String oib,String ime,String prezime){
            this.oib = oib;
            this.ime = ime;
            this.prezime = prezime;
        }

        public StudentBuilder email(String email){
            this.email = email;
            return this;
        }

        public StudentBuilder mobitel(String mobitel){
            this.mobitel = mobitel;
            return this;
        }
        public StudentBuilder grad(String grad){
            this.grad = grad;
            return this;
        }
        public StudentBuilder prosjek(double prosjek){
            this.prosjek = prosjek;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
