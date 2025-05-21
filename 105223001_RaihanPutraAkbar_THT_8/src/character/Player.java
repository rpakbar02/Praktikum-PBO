package character;
import java.util.Random;

public class Player extends Karakter{
    private static Random random = new Random();
    boolean potionAvailable = false;
    int exp;
    int lvl;
    String job;
    public Player(String name){
        super(name);
        exp = 0;
        lvl = 1;
        maxhp = 20;
        maxmp = 5;
        hp = 20;
        mp = 5;
        power = 5;
        magic = 5;
        pdef = 5;
        mdef = 5;
        agi = 5;
        luck = 5;
    }
    public void LevelUp(){
        exp = 0;
        lvl += 1;
        System.out.println("You have leveled up to level " + lvl + "!");
        maxhp += 5;
        maxmp += 2;
        power += 1;
        magic += 1;
        pdef += 1;
        mdef += 1;
        agi += 1;
        luck += 1;
    }
    public void Addexp(int exp, Player player){
        this.exp += exp;
        int nextLvlUp = 10 * lvl;
        if(exp >= nextLvlUp){
            player.LevelUp();
        }
    }
    public int getMaxHp(){
        return maxhp;
    }
    public void setMaxHp(int maxhp){
        this.maxhp = maxhp;
    }
    public void setMaxMp(int maxmp){
        this.maxmp = maxmp;
    }
    public void ShowInfo(){
        System.out.println("Name : " + name);
        System.out.println("Job : " + job);
        System.out.println("HP : " + hp);
        System.out.println("MP : " + mp);
        System.out.println("Power : " + power);
        System.out.println("Magic : " + magic);
        System.out.println("PDef : " + pdef);
        System.out.println("MDef : " + mdef);
        System.out.println("Agi : " + agi);
        System.out.println("Luck : " + luck);
    }
    public void ShowHpMp(){
        System.out.println("HP : " + hp);
        System.out.println("MP : " + mp);
    }
    
    public String getJob(){
        return job;
    }
    public void Defend(){
        pdef *= 2;
        mdef *= 1.5;
        power *= 1.5;
    }
    public void reverseDefend(){
        pdef /= 2;
        mdef /= 1.5;
        power /= 1.5;
    }
    public void Run(int playerAgility, int enemyAgility){
        playerAgility = Math.min(Math.max(playerAgility, 0), 100);
        enemyAgility = Math.min(Math.max(enemyAgility, 0), 100);

        int baseEscapeChance = 40;
        int agilityDifference = playerAgility - enemyAgility;
        int escapeChance = Math.min(Math.max(baseEscapeChance + agilityDifference, 5), 95);

        int roll = random.nextInt(100) + 1;
        if (roll <= escapeChance) {
            System.out.println("Escape successful!");
        } else {
            System.out.println("Escape failed!");
        }
    }

    public void useItem(Player player){
        if(player.potionAvailable){
            setHp(hp += 5);
            potionAvailable = false;
            System.out.println("Potion used!");
        }else{
            System.out.println("Your pouch is empty!");
        }
    }
    public void setPotionAvailable(boolean potionAvailable) {
        this.potionAvailable = potionAvailable;
    }
}