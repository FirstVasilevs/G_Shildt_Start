package Chapter_03.HomeWork;
/**
 * Файл класса HomeWorkHundred.
 *
 * Описание задания:
 * Напишите цикл for, в котором перебирались бы
 * значения от 1000 до 0 с шагом -2.
 */
public class HomeWorkHundred {

    public static void main(String[] args) {

        for (int i = 1000; i > 0; i -= 2) {
            System.out.println("Осталось: " + i);
        }
    }
}
