package Chapter_03.Task_21;

import java.io.IOException;

// Чтение вводимых данных до тех пор,
// пока не будет получена буква q
public class Break2 {

    public static void main(String[] args) throws IOException {

        char ch;

        for ( ; ; ) {
            ch = (char)
            System.in.read(); // Получение символа с клавиатуры
            if (ch == 'q')
                break;
        }
        System.out.println("Вы нажали клавишу q!");
    }
}
