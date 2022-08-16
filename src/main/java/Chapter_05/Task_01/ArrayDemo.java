package Chapter_05.Task_01;
// Демонстрация одномерного массива
public class ArrayDemo {

    public static void main(String[] args) {

        int sample[] = new int[10];
        int i;

        for (i = 0; i < 10; i++)  // Индексация массивов начинается с нуля
            sample[i] = i;

        for (i = 0; i < 10; i++)
            System.out.println("Элемент [" + i + "]: " + sample[i]);
    }
}
