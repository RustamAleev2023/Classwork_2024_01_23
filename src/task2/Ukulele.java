package task2;

public class Ukulele extends MusicalInstrument{
    public Ukulele() {
        this.name = "Ukulele";
        this.sound = "Ukulele sound";
        this.info = "Ukulele info";
        this.history = "Ukulele history";
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

    @Override
    public void history() {
        System.out.println(history);
    }
}
