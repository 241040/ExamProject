public abstract class Character implements Creature {
    private String name;
    private int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    final public boolean isAlive(){
        return hp > 0;
    }
    public void showStats() {
        System.out.println(this.name + " : HP " + this.hp);
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
}
