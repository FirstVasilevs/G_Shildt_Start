package Chapter_03.Task_18;

import java.io.IOException;

// Демонстрация использования цикла do-while
public class DWDemo {

    public static void main(String[] args) throws IOException {

        char ch;

        do {
            System.out.println("Нажмите нужную клавишу, а затем клавишу ENTER: ");
            ch = (char) System.in.read();// чтение символа с клавиатуры
        } while (ch != 'q');
    }
}
