package chapter13;

public class Wand {
    private String name;
    private double power;

    public double getPower() {
        return this.power;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        }
        this.name = name;
    }

    public void setPower(double power) {
        if (power >= 0.5 && power <= 100) {
            throw new IllegalArgumentException("杖の増幅率が範囲外。処理を中断。");
        }
        this.power = power;
    }
}
