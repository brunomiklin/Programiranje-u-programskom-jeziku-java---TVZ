package Iznimke.profesorKod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);
    static void main() {

        logger.warn("error log");
        Integer prvi = 100;
        Integer drugi = 0;
        // System.exit(100);
        logger.info("warn log");
        System.out.println("Broj je " + metoda(prvi, drugi));
    }

    private static Integer metoda(Integer prvi, Integer drugi) {
        try {
            logger.error("info log");
            System.out.println(prvi / drugi);
        }
        catch (RuntimeException e) {
            logger.trace("debug log");
            System.out.println("Neka iznimka");
            return 1;
            // throw new RuntimeException("Nova iznimka"); --> ovo je kao return znaci finally ce biti prije toga
            // System.exit(0); -> ako imas iznad ovog throw new RuntimeException() onda je ovo unreachable statement
        }/*

        catch (ArithmeticException e){
            System.out.println("Nemam dovoljno prava za izracun");
            return;
        }
        */
        finally {
            logger.debug("trace log");
            return 100;
        }
    }
}
