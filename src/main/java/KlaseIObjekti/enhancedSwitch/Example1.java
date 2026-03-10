package KlaseIObjekti.enhancedSwitch;

public class Example1 {
    static void main() {
        int value =1;
//        if(value==1){
//            System.out.println("Value was 1");
//        }else if(value==2){
//            System.out.println("Value was 2");
//        }else
//        {
//            System.out.println("Value was not 1 or 2");
//        }

        switch (value){
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3,4,5 -> System.out.println("Value was 3,4 or 5");

            default -> System.out.println("Value was not 1 or 2");

        }
    }
}
