package Chapter_04.Task_03;
// Использование возвращаемого значения
public class Vehicle {

    int passengers; // количество пассажиров
    int fuelcap; // емкость топливного бака
    int mpq; // потребление топлива в милях на галон

    // возврат дальности поезки для заданного транспорта
    int range() {
        return mpq * fuelcap;
    }
}

class RetMeth {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        // Присваивание значений полям объекта minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpq = 21;

        // Присваивание значения полям объекта sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpq = 12;

        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " на расстояние " +
                minivan.range() + " миль.");
        System.out.println("Спортивный автомобиль может перевезти " + sportscar.passengers +
                " на расстояние " + sportscar.range() + " миль.");
    }
}
