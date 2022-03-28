package Chapter_01.Task_04;
/*
Демонстрация применения инструкции if.
Присвойте файлу с исходным кодом имя IfDemo.java.
*/

public class IfDemo {

    public static void main(String[] args) {

        int a, b, c;

        a = 2;
        b = 3;

        if(a < b)
            System.out.println("а меньше b");

        // Следующая строка никогда не будет выведена
        if(a == b)
            System.out.println("Вы не должны увидеть этот текст");

        System.out.println();

        c = a - b; // переменная "с" содержит значение -1

        System.out.println("c содержит -1");
        if(c >= 0)
            System.out.println("c - не отрицательное число");
        if (c < 0)
            System.out.println("c - отрицательное число");

        System.out.println();

        c = b - a; //переменная "c" теперь содержит значение 1

        System.out.println("c содержит 1");
        if (c >= 0)
            System.out.println("c - не отрицательное число");
        if (c < 0)
            System.out.println("c - отрицательное число");
    }
}
