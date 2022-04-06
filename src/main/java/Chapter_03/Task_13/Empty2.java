package Chapter_03.Task_13;
// Пропуск отдельных составляющих в определении цикла for
public class Empty2 {

    public static void main(String[] args) {

        int i;

        i = 0; // Выносим инициализацию за пределы цикла
        for (; i < 10;) {
            System.out.println("Проход # " + i);
            i++; // Инкрементирование переменной цикла
        }
    }
}
