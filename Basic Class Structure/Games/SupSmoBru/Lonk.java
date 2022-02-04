package SupSmoBru;

import java.util.Random;

public class Lonk extends SSBFighter{

    public Lonk(String Name, int health) {
        super(Name, health);
    }

    /**
     * Takes input of other players damage and returns the damage taken based on the stats of the character.
     * @Param Damage
     * @return int
     */
    @Override
    public int takeDamage(int damage) {
        Random chance = new Random();
        int i = chance.nextInt(100);

        if (i <=50){
            System.out.println("Lonk took half damage");
            this.health = this.health - Math.round(damage / 2);
            return this.health;
        } else{
            System.out.println("Lonk took damage");
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
        System.out.println("Lonk swings sword");
        return 45;
    }
    
}
