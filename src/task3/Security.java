package task3;

public class Security extends Worker{

    public Security() {
        this.name = "Security";
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
