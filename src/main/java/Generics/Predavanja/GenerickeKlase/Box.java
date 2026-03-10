package Generics.Predavanja.GenerickeKlase;

public class Box<T> {
    private T conent;

    public Box(T conent) {
        this.conent = conent;
    }

    public T getContent(){
        return conent;
    }
    public void setConent(T conent){
        this.conent=conent;
    }
}
