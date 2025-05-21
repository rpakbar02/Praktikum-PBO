package character;

public class Knight extends Player{
    public Knight(String name){
        super(name);
        super.job = "Knight";
        super.hp += 10;
        super.power += 3;
        super.pdef += 4;
        super.agi -= 1;
        super.luck += 1;
    }
    public void Smite(Enemy musuh){
        int damage = (int) (power * 1.3 + pdef - musuh.getPDef()/2);
        musuh.hp -= damage;
        System.out.println("You Deal " + damage);
    }
    public void levelUp(){
        super.maxhp += 5;
        super.maxmp += 2;
        super.power += 2;
        super.magic += 1;
        super.pdef += 3;
        super.mdef += 2;
        super.agi += 1;
        super.luck += 2;
    }
}
