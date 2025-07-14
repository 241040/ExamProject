public interface Creature {
    boolean isAlive();

    void showStats();

    void attack(Creature target);

    String getName();

    int getHp();

    void setHp(int hp);
}
