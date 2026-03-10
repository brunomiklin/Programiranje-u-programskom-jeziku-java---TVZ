package OOP.enkapsulacija.player;

public class Player {
    private String name;
    private int health;
    private String wepon;

    public void loseHealth(int damage){
        this.health -= damage;
        if(health<=0){
            System.out.println("Player knocked out of the game");
            this.health=0;
        }
    }
    public void restoreHealth(int damage){
        this.health +=damage;
        if(health>100){
            System.out.println("Player restored 100%");
            this.health = 100;
        }
    }
    public int healthRemaining(){
        return health;
    }
}
