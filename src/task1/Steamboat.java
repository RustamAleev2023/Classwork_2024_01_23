package task1;

public class Steamboat extends Device{
    public Steamboat() {
        this.name = "Steamboat";
        this.sound = "Steamboat sound";
        this.info = "Steamboat info";
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
