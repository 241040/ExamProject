public abstract class Monster implements Creature {
    private String name;
    private int hp;
    private char suffix;

    public Monster(String name, int hp, char suffix) {
        this.name = name;
        this.hp = hp;
        this.suffix = suffix;
        if(hp < 0){
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした。");
        }
    }
    public final boolean isAlive() {
        return hp > 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public char getSuffix() {
        return suffix;
    }
    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }
}
