//Created by Marjorie Pare

//This will hold the CSV parser for the monster data.
//It just reads data from a spreadsheet and populates an array of monster entities
//to pull from randomly during gameplay.
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//This probably does not need to be a class, but I figured it was worth separating it out just in case. 
public class CSVParser{

    public static List<Monster> generateMonsFromFile(){
        String fileName = "Resources/Monsters.csv";
        List<Monster> monsters = new ArrayList<>();
        String line;

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            while((line = br.readLine()) != null){
                String[] data = line.split(",");
                if(!Objects.equals(data[0], "Name")) {
                    String charName = data[0];
                    int maxHealth = Integer.parseInt(data[1]);
                    int attack = Integer.parseInt(data[2]);
                    int defense = Integer.parseInt(data[3]);
                    int magic = Integer.parseInt(data[4]);

                    Monster.MonsterType monType = Monster.MonsterType.values()[Integer.parseInt(data[5])];
                    Monster.Difficulty diff = Monster.Difficulty.values()[Integer.parseInt(data[6])];

                    Monster monster = new Monster(monType, diff, charName, maxHealth, attack, defense, magic);

                    monsters.add(monster);
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        return monsters;
    }
}