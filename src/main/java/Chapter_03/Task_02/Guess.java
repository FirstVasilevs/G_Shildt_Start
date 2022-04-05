package Chapter_03.Task_02;
// Игра в угадывание букв
public class Guess {

    public static void main(String args[])

        throws java.io.IOException {

            char ch, answer = 'К';
            System.out.println("Задумана буква из диапазона A-Z.");
            System.out.print("Попытайтесь ее угадать: ");

            ch = (char) System.in.read(); // чтение символа с клавиатуры

            if (ch == answer) System.out.println("** Правильно! **");
    }
}
