package Chapter_04.Task_02;
// Добавление метода ranged в класс Vehicle
public class Vehicle {

    int passengers;
    int fuelcap;
    int mpq;

    // Отображение дальности поездки транспортного средства
    void  range() {
        System.out.println("Дальность - " + fuelcap * mpq + " миль.");
    }
}

class AddMeth {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // Присваивание значений полям объекта minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpq = 21;

        // Присваивание значений полям объекта sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpq = 12;

        System.out.print("Мини-фургон может перевезти " + minivan.passengers + " пассажиров.");
        minivan.range(); // отображение информации о дальности поездки мини-фургона

        System.out.print("Спортивный автомобиль может перевезти " + sportscar.passengers +
                " пассажиров.");
        sportscar.range(); // отображение дальности поездки спортивного автомобиля
    }

}
