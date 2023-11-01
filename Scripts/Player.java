//this class extends Entity

//Players have 3HP max

public abstract class Player extends Entity{

    //only players can increase their level with a win!
    public void increaseLVL(StatType typeToChange){
     //which stat should be changed (based on the enum) and by the given amount.
            
        if(typeToChange == StatType.Attack){
            //setAttack(getAttack()+1);
        }

        if(typeToChange == StatType.Defense){
            //setDefense(getDefense()+1);
        }

        if(typeToChange == StatType.Magic){
            //setMagic(getMagic()+1);
        }
    }
        
}