package task1;

public class Car extends  Device {
    public Car() {
        this.name = "Car";
        this.sound = "Car sound";
        this.info = "Car info";
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
