package SupSmoBru;

import java.util.Random;

public class SamosA extends SSBFighter {

    public SamosA(String Name, int health) {
        super(Name, health);
    }

    /**
     * Takes input of other players damage and returns the damage taken based on the stats of the character.
     * @Param Damage
     * @return int
     */
    @Override
    public int takeDamage(int damage) {
        System.out.println("SamosA took damage");
        this.health = this.health - damage;
        return this.health;
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
            System.out.println("SamosA shot arm cannon");
            return 40;
        } else{
            System.out.println("SamosA fired missiles");
            return 75;
        }
    }
    
}
