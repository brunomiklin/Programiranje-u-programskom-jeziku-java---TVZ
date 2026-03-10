package Iznimke.fileExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    static void main()  {
        String fileName = "testing.csv";
        testFile2(null);

//        File file = new File(fileName); // File klasa je zastarjela pa ne baca IOException
//        if(!file.exists()){
//            System.out.println("I cant run unless this file exists");
//            System.out.println("Quitting Application, go figure it out");
//            return;
//        }
//        System.out.println("Im good to go!");
    }

    private static void testFile(String fileName) {
        Path path = Paths.get(fileName);
        FileReader fr = null; // ovo moraš napraviti inaće finally ne može dohvatiti reader ako je inicjaliziran unutar try-bloka
        try {
            //Files.readAllLines(path);
            fr = new FileReader(fileName);
        }
        catch (IOException ioe){
//            int x= 5/0;
         }
        finally {
            try {
                if(fr !=null){
                    fr.close();
                };
            }catch (IOException ieo){
                throw new RuntimeException(ieo);
            }

            System.out.println("Maybe I'd log something either way...");

        }
        System.out.println("File exists and able to use as a resource");

    }
    private static void testFile2(String fileName) {
        try(FileReader fr = new FileReader(fileName)) {

        }catch (IllegalStateException | NullPointerException  badData){
            System.out.println("User had addet bad data" + badData.getMessage());

        }
        catch (FileNotFoundException ffe){
            System.out.println("File '" + fileName + "' doesnt exist'");
        }catch (IOException ioe){
            throw new RuntimeException(ioe);
        }catch (Exception e){
            System.out.println("Something unreleted and unexcepted happend");
        }
        finally {

            System.out.println("Maybe I'd log something either way...");
        }
        System.out.println("File exist and able to us as resource");
    }
}
