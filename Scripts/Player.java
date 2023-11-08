//this class extends Entity

//Players have 3HP max

public abstract class Player extends Entity{

    public Player(String charName, int maxHP, int attack, int defense, int magic){
        super(charName, maxHP, attack, defense, magic);
    }
    //only players can increase their level with a win!
    public void increaseLVL(StatType typeToChange){
     //which stat should be changed (based on the enum) and by the given amount.
            
        if(typeToChange == StatType.Attack){
            this.setAttack(this.getAttack()+1);
        }

        if(typeToChange == StatType.Defense){
            this.setDefense(this.getDefense()+1);
        }

        if(typeToChange == StatType.Magic){
            this.setMagic(this.getMagic()+1);
        }
    }
        
}