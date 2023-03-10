package chapter13;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());
        h.hp += recovPoint;
        System.out.println(h.name + "のHPを" + recovPoint + "回復した！");
    }

    public void setName(String name){
        if (name.length() >= 3) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        }
        this.name = name;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("設定されようとしている杖がnullです。処理を中断。");
        }
        this.wand = wand;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("設定されようとしているMPが異常です");
        }
        this.mp = mp;
    }
}
