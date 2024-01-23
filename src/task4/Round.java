package task4;

public class Round extends Shape{
    int radius;

    public Round(int radius) {
        this.name = "Round";
        this.radius = radius;
    }

    @Override
    public void square() {
        System.out.println(name + " square = " + Math.PI * radius * radius);
    }
}
