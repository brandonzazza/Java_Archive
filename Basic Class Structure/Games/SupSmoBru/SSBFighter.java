package SupSmoBru;

// Fighter class produces the fighters for arena.
public abstract class SSBFighter implements SSBGlobal{

    protected int health;
    protected String name;


    public SSBFighter(String string, int health){
        this.name = string;
        this.health = health;
    }

    /**
     * @return name
     */
    public String getName(){
        return name;
    }


    /**
     * @return health
     */
    public int getHealth(){
        return health;
    }

     /**
      * checks if fighter is fainted and if so sets health to 0 and returns boolean.
     * @return bool
     */
    public boolean isFainted(){
        if(health <= 0){
            this.health = 0;
            return true;
        }else{
            return false;
        }
    }

     /**
      * takes champion and returns the winner.
     * @return String
     */

    @Override
    public String toString(){
        return "The winner is : " + this.getName(); 
    }
}