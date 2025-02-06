import java.util.Scanner;

class Entity{
    public double hp;
    public double attackValue;

    public double attack(double opponentHP){
        return opponentHP - attackValue;
    }

    public Entity(double hp, double attackValue){
        this.hp = hp;
        this.attackValue = attackValue;
    }
}

class Player extends Entity{
    public Player(double hp, double attackValue){
        super(hp, attackValue);
    }
}

class Boss extends Entity{
    public Boss(double hp, double attackValue){
        super(hp, attackValue);
    }
}

class Boss_Easy extends Boss{
    public Boss_Easy(){
        super(100, 15);
    }
}

class Boss_Hard extends Boss{
    public Boss_Hard(){
        super(80, 30);
    }
}

public class BossFight {
    public static void main(String[] args) {
        Player p1 = new Player(500, 25);

        Scanner sc = new Scanner(System.in);

        Boss b1 = new Boss_Easy();

        Boolean loop = true;

        Boolean boost = false;

        while(loop){
            // Player attacks boss
            System.out.println("Player dealt: " + p1.attackValue);
            b1.hp = p1.attack(b1.hp);
            System.out.println("Boss has now " + b1.hp + " hp left.");
            
            // Boss attacks Player
            System.out.println("Boss dealt: " + b1.attackValue);
            p1.hp = b1.attack(p1.hp);
            System.out.println("Player has now " + p1.hp + " hp left.");

            if(b1.hp < 50 && !boost){
                b1 = new Boss_Hard();
                System.out.println("Boss got a boost!");
                boost = true;
            }
            else if(b1.hp < 0){
                loop = false;
                System.out.println("You beat the boss");
            }
        }
    }
}
