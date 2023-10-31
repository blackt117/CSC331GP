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

    private MonsterType monsterType;
    private Difficulty difficulty;

    //constructor
    //getters/setters

    public void OnDeath(){
        //if currentHP = 0, show death sprite.
    }
}