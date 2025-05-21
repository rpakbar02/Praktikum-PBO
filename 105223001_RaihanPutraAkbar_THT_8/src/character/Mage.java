package character;
import spells.Spell;
public class Mage extends Player{
    public Mage(String name){
        super(name);
        super.job = "Mage";
        super.mp += 10;
        super.magic += 3;
        super.mdef += 2;
        super.agi -= 1;
        super.luck += 1;
    }
    public void UseMagic(Spell spell, Karakter target){
        int damage = (int) (spell.getBaseDamage() * (this.magic*0.5) - target.getMDef()/2);
        target.hp -= damage;
        System.out.println("You Deal " + damage);
        this.mp -= 5;
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
