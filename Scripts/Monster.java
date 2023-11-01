//Monster extends Entity

//Needs enum of different kinds of monsters
//enum of difficulty (easy, medium, minibiss, boss)

public abstract class Monster extends Entity{

    //monster sprite images will be determined from this enum.
    public enum MonsterType{
        //This is where all the monster types can go
        Goblin,
        Ogre,
        Vampire,
        Mimic,
        Dragon,
        Kobold,
        Spider,
        Skeleton,
        Werewolf
    }

    public enum Difficulty{
        Easy,
        Medium,
        MiniBoss,
        Boss
    }

    //both of these values are used for random generation and sprite visual.
    private MonsterType monsterType;
    private Difficulty difficulty;

    //constructor

    //getters/setters
    public MonsterType getMonsterType(){return this.monsterType;}
    public Difficulty getDifficulty(){return this.difficulty;}

    public void setMonsterType(MonsterType monsterType){this.monsterType = monsterType;}
    public void setDifficulty(Difficulty difficulty){this.difficulty = difficulty;}

}