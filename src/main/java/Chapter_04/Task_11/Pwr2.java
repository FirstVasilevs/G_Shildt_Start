package Chapter_04.Task_11;

public class Pwr2 {

    double b;
    int e;
    double val;

    Pwr2(double base, int exp) {
        this.b = base; // ссылка на переменную экземпляра, а не на параметр
        this.e = exp;

        this.val = 1;
        if (exp == 0) return;
        for ( ; exp > 0; exp--)
            this.val = this.val * base;
    }

    double get_pwr() {
        return this.val;
    }
}

class DemoPwr {

    public static void main(String[] args) {
        Pwr2 x = new Pwr2(4.0, 2);
        Pwr2 y = new Pwr2(2.5, 1);
        Pwr2 z = new Pwr2(5.7, 0);

        System.out.println(x.b + " в степени " + x.e + " равно " + x.get_pwr());
        System.out.println(y.b + " в степени " + y.e + " равно " + y.get_pwr());
        System.out.println(z.b + " в степени " + z.e + " равно " + z.get_pwr());
    }
}