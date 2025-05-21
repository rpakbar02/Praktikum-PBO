package character;

public class Beast extends Enemy{
    public Beast(String name){
        super(name);
        super.hp += 2;
        super.power += 1;
        super.pdef += 1;
        super.agi += 2;
        super.luck += 1;
    }
}
