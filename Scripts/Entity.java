// Edited by: Marjorie Pare

//This should be the class called Entity
//All stat variables should be contained in here!

public abstract class Entity {

    //This will be used to compare values on button press later!
    public enum StatType {
        Attack,
        Defense,
        Magic
    }

    //Not entirely sure how to add images, but I would like a sprite variable here as well.

    private String charName;
    private int maxHP;
    private int currentHP;
    private int attack;
    private int defense;
    private int magic;

    public Entity(String charName, int maxHP, int attack, int defense, int magic){
        this.charName = charName;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
        this.attack = attack;
        this.defense = defense;
        this.magic = magic;
    }

    public Entity(){
        this.charName = "dummy";
        this.maxHP = 3;
        this.currentHP = maxHP;
        this.attack = 5;
        this.defense = 5;
        this.magic = 5;
    }

    public void resetHP(){
        currentHP = maxHP;
    }

    public void decreaseHP(){
        currentHP--;

        if(currentHP == 0){
            this.OnDeath();
        }
    }

    public void OnDeath(){
        //change sprite?
        System.out.println("You died!");
    }

    //------------------------------------------------Getters
    public String getCharName() {
        return charName;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    public int getMagic() {
        return magic;
    }
    public int getCurrentHP() {
        return currentHP;
    }

    //----------------------------------------------------Setters
    public void setCharName(String charName) {
        this.charName = charName;
    }
    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }
    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public void setMagic(int magic) {
        this.magic = magic;
    }
}


