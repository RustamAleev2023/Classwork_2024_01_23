import task1.*;
import task2.*;
import task3.*;
import task4.*;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();
    }

    //Задание1
    //Создать базовый класс «Устройство» и производные
    //классы «Чайник», «Микроволновка», «Автомобиль»,
    //«Пароход». С помощью конструктора установить имя
    //каждого устройства и его характеристики.
    //Реализуйте для каждого из классов методы:
    //■ Sound — издает звук устройства (пишем текстом в
    //консоль);
    //■ Show — отображает название устройства;
    //■ Desc — отображает описание устройства.
    public static void task1() {
        Device device1 = new Kettle();
        device1.show();
        device1.sound();
        device1.desc();

        Device device2 = new Microwave();
        device2.show();
        device2.sound();
        device2.desc();

        Device device3 = new Car();
        device3.show();
        device3.sound();
        device3.desc();

        Device device4 = new Steamboat();
        device4.show();
        device4.sound();
        device4.desc();
    }
    //Задание2
    //Создать базовый класс «Музыкальный инструмент»
    //и производные классы «Скрипка», «Тромбон», «Укулеле»,
    //«Виолончель». С помощью конструктора установить имя
    //каждого музыкального инструмента и его характеристики.
    //Реализуйте для каждого из классов методы:
    //■ Sound — издает звук музыкального инструмента
    //(пишем текстом в консоль);
    //■ Show—отображает название музыкального инстру-
    //мента;
    //■ Desc—отображает описание музыкального инстру-
    //мента;
    //1
    //■ History — отображает историю создания музыкаль-
    //ного инструмента.
    public static void task2(){
        MusicalInstrument instrument1 = new Violin();
        instrument1.show();
        instrument1.sound();
        instrument1.desc();
        instrument1.history();
        MusicalInstrument instrument2 = new Trombone();
        instrument2.show();
        instrument2.sound();
        instrument2.desc();
        instrument2.history();
        MusicalInstrument instrument3 = new Ukulele();
        instrument3.show();
        instrument3.sound();
        instrument3.desc();
        instrument3.history();
        MusicalInstrument instrument4 = new Cello();
        instrument4.show();
        instrument4.sound();
        instrument4.desc();
        instrument4.history();
    }

    //Задание3
    //Создать абстрактный базовый класс Worker (работ-
    //ника) с методом Print(). Создайте четыре производных
    //класса: President, Security, Manager, Engineer. Переопре-
    //делите метод.
    //Print() для вывода информации, соответствующей
    //каждому типу работника.
    public static void task3(){
        Worker worker1 = new President();
        worker1.print();
        Worker worker2 = new Security();
        worker2.print();
        Worker worker3 = new Manager();
        worker3.print();
        Worker worker4 = new Engineer();
        worker4.print();
    }
    //Задание4
    //Создайте абстрактный базовый класс Фигура с аб-
    //страктным методом для подсчета площади. Создайте
    //производные классы: прямоугольник, круг, прямоугольный
    //треугольник, трапеция со своими реализациями метода
    //для подсчета площади. Для проверки определите массив
    //ссылок на абстрактный класс, которым присваиваются
    //адреса различных объектов классов-потомков.
    public static void task4(){
        Shape[] shapes = {new Rectangle(7,10),
                new Round(8),
                new Triangle(12,16),
                new Trapezoid(8,6, 4)};

        for (Shape shape : shapes) {
            shape.square();
        }
    }

}