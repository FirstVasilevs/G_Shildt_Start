package Chapter_03.Task_27;
// Применение инструкции continue
public class ContDemo {

    public static void main(String[] args) {

        int i;
        // Вывод четных чисел в пределах от 0 до 100
        for (i = 0; i <= 100; i++) {
            if ((i % 2) != 0)
                continue; // завершение шага итерации цикла
            System.out.println(i);
        }
    }
}
