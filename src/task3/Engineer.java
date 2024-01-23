package task3;

public class Engineer extends Worker{
    public Engineer() {
        this.name = "Engineer";
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
