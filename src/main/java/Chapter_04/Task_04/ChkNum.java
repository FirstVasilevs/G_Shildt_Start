package Chapter_04.Task_04;
// Простой пример применения параметра в методе
public class ChkNum {

    // Возврат логического значения true, если х содержит четное число
    boolean isEven(int x) { // здесь х целочисленный параметр метода isEven()
        if ((x % 2) == 0) return true;
        else return false;
    }
}

class ParmDemo {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();
        if (e.isEven(10)) System.out.println("10 - четное число");
        if (e.isEven(9)) System.out.println("9 - четное число");
        if (e.isEven(8)) System.out.println("8 - четное число");
    }
}
