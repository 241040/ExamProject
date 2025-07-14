public abstract class Character implements Creature{
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

}
