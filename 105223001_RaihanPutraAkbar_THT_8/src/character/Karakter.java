package character;
import java.util.Random;

public class Karakter {
    private static Random random = new Random();
    boolean alive = true;
    String name;
    int maxhp;
    int maxmp;
    int hp;
    int mp;
    int power;
    int magic;
    int pdef;
    int mdef;
    int agi;
    int luck;
    public Karakter(String name){
        this.name = name;
    }
    public static Player CreateCharacter(int pilihan, String name){
        switch (pilihan){
            case 1:
                Player knight = new Knight(name);
                return knight; 
            case 2:
                Player mage = new Mage(name);
                return mage;
        }
        return null;
    }
    public void Attack(Karakter target, int Luck){
        Luck = Math.min(Math.max(Luck, 0), 100);
        int baseHitChance = 80;
        int luckBonus = Luck / 10;
        int finalHitChance = baseHitChance + luckBonus;
        int damage = Math.max(((int) ((int)power*1.2)) - ((int) ((int)target.getPDef() * 0.5)), 1);

        int roll = random.nextInt(100) + 1;

        if (roll <= finalHitChance) {
            System.out.println("Attack hits! Dealt " + damage + " damage.");
            target.hp -= damage;
        } else {
            System.out.println("Attack missed!");
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAlive(boolean alive){
        this.alive = alive;
    }
    public boolean getAlive(){
        return alive;
    }
    public void setHp(int hp){
        this.hp = hp;
        if(hp > maxhp){
            hp = maxhp;
        }
    }
    public void setMp(int mp){
        this.mp = mp;
    }
    public void setPower(int power){
        this.power = power;
    }    
    public void setMagic(int magic){
        this.magic = magic;
    }
    public void setPDef(int pdef){
        this.pdef = pdef;
    }
    public void setMDef(int mdef){
        this.mdef = mdef;
    }  
    public void setAgi(int agi){
        this.agi = agi;
    }
    public void setLuck(int luck){
        this.luck = luck;
    }
    public int getHp(){
        return hp;
    }
    public int getMp(){
        return mp;
    }
    public int getPower(){
        return power;
    }
    public int getMagic(){
        return magic;
    }
    public int getPDef(){
        return pdef;
    }
    public int getMDef(){
        return mdef;
    }
    public int getAgi(){
        return agi;
    }
    public int getLuck(){
        return luck;
    }
}
