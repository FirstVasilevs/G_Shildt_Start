package Chapter_03.Task_12;
// Пропуск отдельных составляющих в определении цикла for
public class Empty {

    public static void main(String[] args) {

        int i;

        for (i = 0; i < 10;) {
            System.out.println("Проход # " + i);
            i++; // инкрементирование переменной цикла
        }
    }
}
