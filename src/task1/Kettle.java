package task1;

public class Kettle extends Device{
    public Kettle() {
        this.name = "Kettle";
        this.sound = "Kettle sound";
        this.info = "Kettle info";
    }


    @Override
    public void sound() {
        System.out.println(sound);
    }

    @Override
    public void show() {
        System.out.println(name);
    }

    @Override
    public void desc() {
        System.out.println(info);
    }
}
