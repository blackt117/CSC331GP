//Created by Marjorie Pare

//This will hold the CSV parser for the monster data.
//It just reads data from a spreadsheet and populates an array of monster entities
//to pull from randomly during gameplay.
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

//This probably does not need to be a class, but I figured it was worth separating it out just in case. 
public class CSVParser{
    private Entity[] entities;

    public static Entity[] generateMonsFromFile(){
        try(Scanner scanner = new Scanner(new File("Monsters.csv"))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();

                try(Scanner rowScanner = new Scanner(line)){
                    rowScanner.useDelimiter(",");
                    while(rowScanner.hasNext()){

                        //Replace this with all the data for Entity,
                        //put it in the right location and add it as a new one.
                        System.out.print(scanner.next());
                    }
                }
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


        return new Entity[] {};
    }
}