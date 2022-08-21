package Chapter_05.Task_11;
// Циклы типа for-each предназначены только для чтения
public class NoChange {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 10; // Эта операция не изменяет содержимое массива nums
        }
        System.out.println();

        for (int x : nums)
            System.out.print(x + " ");
        System.out.println();
    }
}
