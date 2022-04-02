package Chapter_02.Task_14;
// Демонстрация автоматического преобразования типа long в тип double
public class LtoD {

    public static void main(String[] args) {

        long L;
        double D;

        L = 100123285L;
        D = L;

        System.out.println("L и D: " + L + " " + D);
    }
}
/*
// *** Эта программа не пройдет компиляцию ***
    class LtoD {
        public static void main(String args[]) {
        long L;
        double D;
        D = 100123285.0;
        L = D; // Ошибка!!! ◄------ Тип double не преобразуется автоматически
        в тип long
        System.out.println("L и D: " + L + ” " + D);
    }
}
 */