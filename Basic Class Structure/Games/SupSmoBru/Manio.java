package SupSmoBru;

import java.util.Random;

public class Manio extends SSBFighter{

    public Manio(String name, int health) {
        super(name, health);
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

        if (i <= 25){
            System.out.println("Manio Dodged Attack");
            return this.health;  
        } else{
            System.out.println("Manio took damage");
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
        int i = chance.nextInt(50, 100);

        System.out.println("Mario Stomped");
        return i;
    }
}
