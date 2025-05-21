package character;

public class Enemy extends Karakter{
    public Enemy(String name){
        super(name);
        super.hp = 10;
        super.power = 3;
        super.pdef = 4;
        super.agi = 1;
        super.luck = 1;
    }
}
