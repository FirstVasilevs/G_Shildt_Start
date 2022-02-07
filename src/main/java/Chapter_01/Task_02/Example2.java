package Chapter_01.Task_02;
/*
Демонстрация использования переменных.
Присвойте файлу с исходным кодом имя Example2.java.
*/

public class Example2 {

    public static void main(String[] args) {

        int var1; // объявляется переменная
        int var2; // объявляется еще одна переменная

        var1 = 1024; // переменной var1 присваевается значение 1024
        System.out.println("Переменная var1 с содержит " + var1);

        var2 = var1 / 2;

        System.out.print("Переменная var2 содержит var1 / 2: ");
        System.out.println(var2);
    }
}
