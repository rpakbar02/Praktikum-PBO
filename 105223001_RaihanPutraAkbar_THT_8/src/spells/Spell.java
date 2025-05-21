package spells;

public class Spell{
    static int BaseDamage;
    public int getBaseDamage() {
        return BaseDamage;
    }
    public static void Heal(){
        BaseDamage = -3;
    }
}
