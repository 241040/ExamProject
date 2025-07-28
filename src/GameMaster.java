import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<Character>();
        Hero h = new Hero("勇者",100,"剣");
        Wizard w = new Wizard("魔法使い",60,20);
        Thief t = new Thief("盗賊",70);
        party.add(h);
        party.add(w);
        party.add(t);
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        Goblin g = new Goblin('A',50);
        Matango m = new Matango('A',45);
        Slime s = new Slime('A',40);
        monsters.add(g);
        monsters.add(m);
        monsters.add(s);
        System.out.println("---味方パーティ---");
        for (Character character : party) {
            character.showStatus();
        }
        System.out.println("---敵グループ---");
        for (Monster monster : monsters) {
            monster.showStatus();
        }

        System.out.println("\n味方の総攻撃！");
        for (Character character : party) {
            for (Monster monster : monsters) {
                character.attack(monster);
            }
        }

        System.out.println("\n敵の総攻撃！");
        for (Monster monster : monsters) {
            for (Character character : party) {
                monster.attack(character);
            }
        }

        System.out.println("\nダメージを受けた勇者が突然光だした！");
        System.out.println("勇者はスーパーヒーローに進化した！");

        Hero originalHero = (Hero) party.get(0);
        SuperHero superHero = new SuperHero(originalHero);
        party.set(0, superHero);

        System.out.println();
        System.out.println("スーパーヒーローの強力な一撃！");
        for (Monster monster : monsters) {
            superHero.attack(monster);
        }

        System.out.println("\n---味方パーティ最終ステータス---");
        for (Character character : party) {
            character.showStatus();
            if (character.isAlive()) {
                System.out.println("生存状況：生存");
            } else {
                System.out.println("生存状況：戦闘不能");
            }
        }

        System.out.println("\n---敵グループ最終ステータス---");
        for (Monster monster : monsters) {
            monster.showStatus();
            if (monster.isAlive()) {
                System.out.println("生存状況：生存");
            } else {
                System.out.println("生存状況：討伐済み");
            }
        }
    }
}
