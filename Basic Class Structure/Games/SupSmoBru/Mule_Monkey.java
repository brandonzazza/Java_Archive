package SupSmoBru;

import java.util.Random;

public class Mule_Monkey extends SSBFighter{

    public Mule_Monkey(String Name, int health) {
        super(Name, health);
    }
    /**
     * Takes input of other players damage and returns the damage taken based on the stats of the character.
     * @Param Damage
     * @return int
     */
    @Override
    public int takeDamage(int damage) {
        if (this.health < 50){
            System.out.println("Mule Moneky took reduced damage");
            this.health = this.health - (damage - 10);
            return this.health;
        } else{
            System.out.println("Mule Moneky took damage");
            this.health = this.health - damage;
            return this.health;
        }
    }

    /**
     * Produces a int value of the generated attack based on the individual character.
     * @return int
     */
    @Override
    public int attack() {
        Random chance = new Random();
        int i = chance.nextInt(100);
        if (i <= 75){
            System.out.println("Mule Moneky Bashed");
            return 75;
        } else{
            System.out.println("Mule Monkey Missed");
            return 0;
        }
    }  
}
