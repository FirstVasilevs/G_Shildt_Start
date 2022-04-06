package Chapter_03.Task_09;
// Цикл for, выполняющийся с отрицательным приращением переменной
public class DecrFor {

    public static void main(String[] args) {

        int x;

        for (x = 100; x > -100 ; x -= 5) {

            System.out.println(x);
        }

        for (int count = 10; count < 5; count++) {

            x += count;// эта инструкция не будет выполнена
        }
    }
}
