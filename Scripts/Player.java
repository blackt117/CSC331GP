//this class extends Entity

//Players have 3HP max

public abstract class Player extends Entity{

    //only players can increase their level with a win!
    public void increaseLVL(StatType typeToChange, int amount){
     //This function should have a switch or if/else block that simply checks
     //which stat should be changed (based on the enum) and by the given amount.
    }
}