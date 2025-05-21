package spells;

public class ElementalSpell extends Spell{
    static String element;
    public static void CastFireBall(){
        BaseDamage = 4;
        element = "Fire";
    }
    public static void CastBlizzard(){
        BaseDamage = 3;
        element = "Ice";
    }
}
