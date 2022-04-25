package Chapter_04.Task_01;

public class VehicleDemo {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        int range;

        // Присваивание значений полям в объекте minivan

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21; // Использование точечной нотации для доступа к переменным экземпляра

        // Расчет дальности поездки с полным баком горючего
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Мини-фургон может перевезти " + minivan.passengers +
                " пассажиров на расстояние " + range + " миль");
    }
}
