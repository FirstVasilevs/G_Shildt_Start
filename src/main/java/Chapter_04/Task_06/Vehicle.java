package Chapter_04.Task_06;
/*
Добавление параметризированного метода, в котором выполняется
расчет объема топлива, необходимого транспортному средству
для преодоления заданного расстояния.
*/
public class Vehicle {

    int passengers; // количество пассажиров
    int fuelcap; // емкость топливного бака
    int mpg; // потребление топлива в милях на галлон

    // Определение дальности поездки транспортного средства
    int range() {
        return mpg * fuelcap;
    }
    // Расчет количества топлива, необходимого транспортному
    // средству для преодоления заданного расстояния
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class CompFuel {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int dist = 252;

        // Присваивание значений полям объекта minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Присваивание значений полям объекта sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль мини-фургону требуется " + gallons +
                " галлонов топлива");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль спортивному автомобилю требуется " +
                gallons + " галлонов топлива");
    }
}
