// Edited by: Marjorie Pare

//This should be the class called Entity
//All stat variables should be contained in here!

public abstract class Entity {

    //This will be used to compare values on button press later!
    public enum StatType{
        Attack,
        Defense,
        Magic
    }

    //Not entirely sure how to add images, but I would like a sprite variable here as well.

/**
 * This class needs:
 * String - name  <---------This is the name the player or enemy has. ex: "Bill" or "Hobgob"
 * Int - maxHP
 * Int - currentHP
 * Int - Attack
 * Int - Defense
 * Int - Magic
 *
 * Constructor - Create one for input values, and one for defaults.
 * Constructor() default values:
 *                  String: Dummy
 *                  maxHP: 3
 *                  currentHP = maxHP
 *                  Attack: 5
 *                  Defense: 5
 *                  Magic: 5
 *
 * (Getters and setters)
 *
 *
 * increaseHP(){ after defeating an enemy, currentHP = maxHP;}
 * decreaseHP(){called when a loss happens. currentHP--; }
 * 
 *    public void OnDeath(){
 *       //if currentHP = 0, show death sprite.
 *   }
 */

}