package Game.Game;

import java.util.Random;

public class Team {
    protected Hero[] team;
    int counter;
    public Team(int number) {
        counter= number;
        team=new Hero[number];
        team[0] =new Doctor();
        for (int i=1;i<counter;i++){
            Random Rnd=new Random();
            int rand=Rnd.nextInt(number);
            if (rand%2==0)
                team[i]=new Warrior();
            else
                team[i]=new Assasin();
        }
    }

    public Hero[] getTeam() {
        return team;
    }
}
