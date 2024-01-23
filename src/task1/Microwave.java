package task1;

public class Microwave extends Device{
    public Microwave() {
        this.name = "Microwave";
        this.sound = "Microwave sound";
        this.info = "Microwave info";
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
