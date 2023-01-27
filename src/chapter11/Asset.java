package chapter11;

public abstract class Asset {
    String name;

    public Asset(String name) {
        this.name = name;
    }

    public String getName() {
        return  this.name;
    }
}
