package task2;

public class Trombone extends MusicalInstrument{
    public Trombone() {
        this.name = "Trombone";
        this.sound = "Trombone sound";
        this.info = "Trombone info";
        this.history = "Trombone history";
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
