package Chapter_04.Exercise_4_1;
/*
Упражнение 4.1
Преобразование в класс Help справочной системы
из упражнения 3.3.
*/
import java.io.IOException;

class Help {

    void helpon(int what) {
        switch (what) {

            case '1':
                System.out.println("Инструкция if:\n");
                System.out.println("if(условие) инструкция;");
                System.out.println("else инструкция;");
                break;
            case '2':
                System.out.println("Инструкция switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность инструкций");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Цикл for:\n");
                System.out.print("for(инициализация; условие; итерация)");
                System.out.println(" инстукция;");
                break;
            case '4':
                System.out.println("Цикл while:\n");
                System.out.println("while(условие) инструкция;");
                break;
            case '5':
                System.out.println("Цикл do-while:\n");
                System.out.println("do {");
                System.out.println(" инструкция;");
                System.out.println("} while (условие);");
                break;
            case '6':
                System.out.println("Инструкция break:\n");
                System.out.println("break; или break метка;");
                break;
            case '7':
                System.out.println("Инструкция continue:\n");
                System.out.println("continue; или continue метка;");
                break;
        }
        System.out.println();
    }

    void showmenu() {
        System.out.println("Справка:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue\n");
        System.out.println("Выберите: (q - выход): ");
    }

    boolean isvalid(int ch) {
        if(ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }
}

public class HelpClassDemo {

    public static void main(String[] args) throws IOException {

        char choice, ignore;
        Help hipobj = new Help();

        for ( ; ; ) {
            do {
                hipobj.showmenu();

                choice = (char) System.in.read();
                System.out.println("\n");
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!hipobj.isvalid(choice));

            if (choice == 'q') break;

            System.out.println("\n");

            hipobj.helpon(choice);
        }
    }
}


