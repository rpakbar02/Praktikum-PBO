package scenario;
import character.*;
import java.util.Random;
import java.util.Scanner;
import spells.*;

public class Act1 {
    public Act1(Player player){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of magic, " + player.getName() + "!\n");
        System.out.println("Long time ago, the world is at war with Tiamat the Lich Dragon.");
        System.out.println("In order to defeat Tiamat, The world's finest sorcerers and warriors gather to slain and seal the dragon.");
        System.out.println("They performed a forbidden ritual known as The Eclipse Rite, wherein they must chant the incantation of The Umbral Convergence and sever the dragon's head at the very moment of a solar eclipse. By that the Lich Dragon is sealed.\n");
        System.out.println("For 1000 years, The Dragon is sealed and the incantation buried deep in the earth. So that no one can use it to break the seal.\nUntil, one day, a dark sorcerer named Nyreth The Black Seer unearth the incantation from the Ancient Lore and attempt to break the seal.\n");
        System.out.println("You are a " + player.getJob() + " that is sent by the king to defeat Nyreth The Black Seer and retrieve the incantation.");
        System.out.println("In order to defeat Nyreth The Black Seer, you must travel to the Crescent Peak and find the Moon's Bane.");
        System.out.println("You will face many challenges on your way.\n");
        System.out.println("Good Luck!");

        System.out.println("You embark on a journey to the Crescent Peak, but you need to pass Willow Forest to get there.");
        int x = 0, y = 0;
        while((x != 5 || y != 2) && player.getAlive()){
            System.out.println("Your Position: (" + x + ", " + y + ")");
            System.out.print("Where do you want to go?\n1. Forward\n2. Left\n3. Right\n4. Backward\nYour Choice: ");
            switch (input.nextInt()) {
                case 1:
                    y += 1;
                    Event.GenerateEvent(player);
                    break;
                case 2:
                    x -= 1;
                    Event.GenerateEvent(player);
                    break;
                case 3:
                    Event.GenerateEvent(player);
                    x += 1;
                    break;
                case 4:
                    Event.GenerateEvent(player);
                    y -= 1;
                    break;
                default:
                    System.out.println("Please move, you don't want to stay here forever.");
                    break;
                }
            if(y < 0){
                System.out.println("It is a Dead End. You have to go back.");
                y += 1;
            }
            else if(y == 2 && x == 0){
                System.out.println("There is an fork here. You can go left, or right.");
            }
            else if(x == -2 && y == 2){
                System.out.println("There is a intersection here. You can go forward, left, or right.");
            }
            else if(x == -3 && y == 2){
                System.out.println("You fall from a high cliff. You Die.");
                player.setAlive(false);
            }
            else if(x == 5 && y == 2){
                System.out.println("You finally arrive at the Crescent Peak.\nIn order to continue to Act II please buy this game first ehe.");
            }
            else if(y > 2 && x == 0){
                System.out.println("It is a Dead End. You have to go back.");
                y = 2;
            }
            else if(y != 2 && x != 0){
                System.out.println("It is a Dead End. You have to go back.");
                y = 2;
            }
            else if(x!= 0 && y < 2){
                System.out.println("It is a Dead End. You have to go back.");
                x = 0;
            }
        }
    }
}

class Event {
    private static Random random = new Random();
    public static void GenerateEvent(Player player){
        int eventChance = random.nextInt(9) + 1;
        if(eventChance > 7) {
            int enemyChance = random.nextInt(1) + 1;
            if (enemyChance == 1) {
                System.out.println("You get attacked by a Dire Wolf!");
                Enemy enemy = new Beast("Dire Wolf");
                Battle.GoBattle(player, enemy);
            }
            else if (enemyChance == 2) {
                System.out.println("You get attacked by a Bear!");
                Enemy enemy = new Beast("Bear");
                Battle.GoBattle(player, enemy);
            }
        }else if(eventChance > 5){
            player.setPotionAvailable(true);
            System.out.println("You found a potion!");
        }
    }
}

class Battle{
    static Scanner input = new Scanner(System.in);
    public static void GoBattle(Player player, Enemy enemy){
        boolean isdefend = false;
        while(enemy.getHp() > 0 && player.getHp() > 0) {
            System.out.println("Your Hp: " + player.getHp() + " | " + "Enemy Hp: " + enemy.getHp());
            System.out.println("Your Mp: " + player.getMp() + " | " + "Enemy Mp: " + enemy.getMp());
            if("Mage".equals(player.getJob())){
                System.out.println("Choose Action:\n1. Attack\n2. Defend\n3. Items\n4. Spell\n5. Run\nYour Choice: ");
                switch (input.nextInt()) {
                    case 1:
                        System.out.println("You try to Attack!");
                        player.Attack(enemy, player.getLuck());
                        if(isdefend)player.reverseDefend();
                        isdefend = false;
                        break;
                    case 2:
                        System.out.println("You are Defending!");
                        if(isdefend)player.reverseDefend(); 
                        isdefend = false;
                        if(!isdefend)player.Defend();
                        isdefend = true;
                        break;
                    case 3:
                        System.out.println("You try using item!");
                        player.useItem(player);
                        if(isdefend)player.reverseDefend();
                        isdefend = false;
                        break;
                    case 4:
                        System.out.println("You are using spell!");
                        System.out.println("Choose Spell:\n1. Fireball\n2. Blizzard\n3. Heal\nYour Choice: ");
                        switch (input.nextInt()) {
                            case 1:
                                Spell fire = new ElementalSpell();
                                if(fire instanceof ElementalSpell fireball){
                                    fireball.CastFireBall();
                                }
                                if(player instanceof Mage mage){
                                    mage.UseMagic(fire, enemy);
                                }
                                break;
                            case 2:
                                Spell ice = new ElementalSpell();
                                if(ice instanceof ElementalSpell blizzard){
                                    blizzard.CastBlizzard();
                                }
                                if(player instanceof Mage mage){
                                    mage.UseMagic(ice, enemy);
                                }
                            case 3:
                                Spell heal = new Spell();
                                heal.Heal();
                                if(player instanceof Mage mage){
                                    mage.UseMagic(heal, player);
                                    if(player.getHp() > player.getMaxHp())player.setHp(player.getMaxHp());
                                }
                                break;
                            default:
                                continue;
                        }
                        if(isdefend)player.reverseDefend();
                        isdefend = false;
                        break;
                    case 5:
                        System.out.println("You try to run!");
                        player.Run(player.getAgi(), enemy.getAgi());
                        if(isdefend)player.reverseDefend();
                        isdefend = false;
                        break;
                    default:
                        continue;
                }
            }else{
                System.out.print("Choose Action:\n1. Attack\n2. Defend\n3. Items\n4. Smite\n5. Run\nYour Choice: ");
                switch (input.nextInt()) {
                    case 1:
                        System.out.println("You try to Attack!");
                        player.Attack(enemy, player.getLuck());
                        if(isdefend)player.reverseDefend();
                        isdefend = false;
                        break;
                    case 2:
                        System.out.println("You are Defending!");
                        if(isdefend)player.reverseDefend();
                        isdefend = false;
                        player.Defend();
                        if(!isdefend)player.Defend();
                        isdefend = true;
                        break;
                    case 3:
                        System.out.println("You try using item!");
                        player.useItem(player);
                        if(isdefend)player.reverseDefend();
                        isdefend = false;
                        break;
                    case 4:
                        System.out.println("You Use Smite!");
                        if(player instanceof Knight knight){
                            knight.Smite(enemy);
                        }
                        if(isdefend)player.reverseDefend();
                        isdefend = false;
                        break;
                    case 5:
                        System.out.println("You try to run!");
                        player.Run(player.getAgi(), enemy.getAgi());
                        if(isdefend)player.reverseDefend();
                        isdefend = false;
                        break;
                    default:
                        continue;
                }
            }
            if(player.getHp() > 0 && enemy.getHp() > 0){
                System.out.println("Enemy Attacks!");
                enemy.Attack(player, enemy.getLuck());
            }
        }
        if(player.getHp() > 0){
            System.out.println("You Win!");
            System.out.println("You gain 10 exp!");
            player.Addexp(10, player);
        }else{
            System.out.println("You Die!\nGame Over.");
            player.setAlive(false);
        }
    }
}