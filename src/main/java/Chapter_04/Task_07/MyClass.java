package Chapter_04.Task_07;
// Простой конструктор
public class MyClass {

    int x;

    MyClass() { // конструктор класса MyClass
        x = 10;
    }
}

class ConsDemo {
    public static void main(String[] args) {

        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        System.out.println(t1.x + " " + t2.x);
    }
}
