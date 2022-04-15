package Chapter_03.HomeWork;

import java.io.IOException;

/**
 * Файл класса HomeWork.
 *
 * Описание задания:
 * Напишите программу, которая вводила бы символы с клавиатуры до тех пор,
 * пока не встретится точка. Предусмотрите в программе счетчик числа пробелов.
 * Сведения о количестве пробелов должны выводиться в конце программы.
 */
public class HomeWorkSimvol {

    public static void main(String[] args) throws IOException {

        char simvol, ignore;
        int count = 0;

        for ( ; ; ) {
            System.out.print("Введите символ: ");
            simvol = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (simvol == '.')
                break;
            if (simvol == ' ')
                count++;
        }
        System.out.println("Всего пробелов " + count);
    }
}
