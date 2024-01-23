package task2;

public class Cello extends MusicalInstrument{
    public Cello() {
        this.name = "Cello";
        this.sound = "Cello sound";
        this.info = "Cello info";
        this.history = "Cello history";
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
