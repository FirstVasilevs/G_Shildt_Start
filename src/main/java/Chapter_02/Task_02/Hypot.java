package Chapter_02.Task_02;
/*
Определение длины гипотенузы исходя из длины катетов,
по теореме Пифагора
*/
public class Hypot {

    public static void main(String[] args) {

        double x, y, z;
        x = 3;
        y = 4;
        z = Math.sqrt(x * x + y * y);

        System.out.println("Длмна гипотенузы: " + z);
    }
}
