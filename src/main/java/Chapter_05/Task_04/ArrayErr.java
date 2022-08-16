package Chapter_05.Task_04;
// Намеренный выход за пределы массива
public class ArrayErr {

    public static void main(String[] args) {

        int sample[] = new int[10];
        int i;

        // Имитация выхода индекса за пределы массива
        for (i = 0; i < 100; i++) {
            sample[i] = i;
        }
    }
}
