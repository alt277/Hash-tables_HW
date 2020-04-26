package Game.Game;

import java.util.Random;

abstract class Hero {

    protected int health;
    protected String name;
    protected int damage;
    protected boolean alive;

    public Hero() {
        this.name =this.giveName();
        this.alive=true;

    }
    public boolean getAlive(){ return alive; }
    public  boolean isAlive(){
        if (health>0)
          return true;
        else
            return false;
    }
public String giveName(){
    String str=new String("");
    Random Rnd=new Random();
    int j=4+Rnd.nextInt(4);
    for(int i=0;i<j;i++){
        char ch;
        int random=(Rnd.nextInt(3)*4);

            if(i==0)  ch=(char)( 65+ ( random==8 ?  (8+ (Rnd.nextInt(2))*6)
                                                 :  random ));
            else if (i % 2 == 0)  ch=(char)( 97+( random==8 ?  (8+ (Rnd.nextInt(2))*6)
                    :  random ));
             else ch=(char)(98+Rnd.nextInt(10)*2);

             str+=ch;
        this.name= str;

    }
    return str;
}
    abstract void hit(Hero hero);

   abstract void healing(Hero hero);

    void causeDamage(int damage) {
        if(health <= 0) {
            System.out.println( name+" уже мертвый!");
        } else {
            health -= damage;
        }

    }
    public int getHealth() {
        return health;
    }

    void addHealth(int health) {
      if(this.health==0)  this.health += health;
    }
    void info() {
        System.out.println(name + " "+this.getClass().getName() + (health < 0 ? " вне игры "+health
                                                                      :" "+ health) + " " + damage);
    }
}
