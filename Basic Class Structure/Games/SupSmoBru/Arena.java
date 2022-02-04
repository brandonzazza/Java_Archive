package SupSmoBru;

public class Arena{
    // declare fighters
    static Manio c1 = new Manio("Manio", 100);
    static Lonk c2 = new Lonk("Lonk", 150);
    static SamosA c3 = new SamosA("SamosA", 200);
    static Mule_Monkey c4 = new Mule_Monkey("Mule Monkey", 200);


    /**
     * Take in two SSBFighter players and makes them battle. Returns the winner.
     * @param player1
     * @param player2
     * @return SSBFighter
     */
    public static SSBFighter arena(SSBFighter player1, SSBFighter player2){
        boolean won = false;

        while(won != true){
            int p1_attack = player1.attack();
            int p2_attack = player2.attack();

            player1.takeDamage(p2_attack);
            won = player1.isFainted();
            player2.takeDamage(p1_attack);
            won = player2.isFainted();

            System.out.println( player1.getName() + "  Remaining health : " + player1.getHealth() + " | "+ player2.getName() + "  Remaining health : " + player2.getHealth());
        }

        // checks if player is fainted and returns the winner.
        if (player2.isFainted()){
            return player1;
        } else {
            return player2;
        }
    }

    // Main driver code.
    public static void main(String[] args) {
        SSBFighter champion = arena(c1, c2);
        System.out.println(champion.toString());
    }
}