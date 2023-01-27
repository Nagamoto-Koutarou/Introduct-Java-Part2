public class Main {
    public static void main(String[] args) {
        // 勇者を作成
        Hero h = new Hero();
        // フィールドに初期値をセット
        h.name = "ミナト";
        h.hp = 100;

        Matango m1 = new Matango('A');

        Matango m2 = new Matango('B');
        h.slip();
        m1.run();
        m2.run();
        h.run();
    }
}
