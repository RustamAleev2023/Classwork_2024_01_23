package task2;

public class Violin extends MusicalInstrument{
    public Violin() {
        this.name = "Violin";
        this.sound = "Violin sound";
        this.info = "Violin info";
        this.history = "Violin history";

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
