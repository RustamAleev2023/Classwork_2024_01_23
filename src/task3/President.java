package task3;

public class President extends Worker{
    public President() {
        this.name = "President";
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
