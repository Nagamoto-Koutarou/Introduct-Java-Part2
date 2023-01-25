public class Cleric {
    String name;
    int hp;
    final int MAXHP = 50;
    int mp;
    final int MAXMP = 10;

    public void selfAid() {
        this.mp -= 5;
        this.hp += 50;
    }

    public int pray(int sec) {
        int correctionPoint = sec + new java.util.Random().nextInt(3);
        return correctionPoint;
    }
}
