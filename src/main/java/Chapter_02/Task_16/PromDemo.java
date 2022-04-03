package Chapter_02.Task_16;
// Неожиданный результат повышения типов!
public class PromDemo {

    public static void main(String[] args) {

        byte b;
        int i;

        b = 10;
        i = b * b; // Приведение типов не требуется, так как тип уже повышен до in t
        b = 10;
        b = (byte) (b * b); // нужно приведение типов!

        System.out.println("i и b: " + i + " " + b);
    }
}
