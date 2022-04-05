package Chapter_03.Task_01;
// Чтение символа с клавиатуры
public class KbIn {

    public static void main(String args[])

        throws java.io.IOException {

            System.out.print("Нажмите нужную клавишу, а затем\n" +
                    "клавишу ENTER: ");

            char ch = (char) System.in.read();

            System.out.println("Вы нажали клавишу " + ch);

        }
}
