package Chapter_05.Task_17;
// Применение метода substring ()
public class SubStr {

    public static void main(String[] args) {

        String orgstr = "Java - двигатель Интернета";

        // Сформировать подстроку
        String substr = orgstr.substring(7, 26); // новая строка от 7 до 26 символа оригинала

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
