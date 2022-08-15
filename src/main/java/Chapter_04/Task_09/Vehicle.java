package Chapter_04.Task_09;
// Добавление конструктора
public class Vehicle {

    int passengers; // количество пассажиров
    int fuelcap; // емкость топливного бака
    int mpg; // потребление топлива в милях на галон

    // Это конструктор класса Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Определение дальности поездки транспортного средства
    int range() {
        return mpg * fuelcap;
    }

    // Расчет объема топлива, необходимого транспортному средству для преодоления заданного расстояния
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class VehConsDemo {

    public static void main(String[] args) {

        // Завершение создания объектов транспортных средств
        Vehicle minivan = new Vehicle(7,16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль мини-фургону требуется " +
                gallons + " галлонов топлива");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль спортивному автомобилю требуется " +
                gallons + " галлонов топлива");
    }
}
