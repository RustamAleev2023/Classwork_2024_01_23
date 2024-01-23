package task3;

public class Manager extends Worker{

    public Manager() {
        this.name = "Manager";
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
