package Chapter_02.Task_03;
//С символьными переменными можно обращаться
// как с целочисленными
public class CharArithDemo {

    public static void main(String[] args) {

        char ch;

        ch = 'X';
        System.out.println("Сначала ch содержит " + ch);

        ch++; // инкрементировать переменную ch
        System.out.println("Теперь ch содержит " + ch);

        ch = 90; // присвоить переменной ch значение 'Z'
        System.out.println("Теперь ch содержит " + ch);
    }
}
