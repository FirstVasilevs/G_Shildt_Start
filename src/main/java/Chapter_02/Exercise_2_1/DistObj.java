package Chapter_02.Exercise_2_1;
/*
А теперь усложним задачу. Рассчитать расстояние до крупного объекта,
например скалы, можно по времени прихода эхо. Так, если вы хлопнете в
ладоши, время, через которое вернется эхо, будет равно времени прохождения звука в прямом
и обратном направлении. Разделив этот промежуток времени на два, вы получите время прохождения
звука от вас до объекта.
Полученное значение можно затем использовать для расчета расстояния до
объекта. Видоизмените рассмотренную выше программу, используя при вычислении значение
промежутка времени до прихода эха
 */
public class DistObj {

    public static void main(String[] args) {

        int speedSound = 335; // Скорость звука в м/c
        double dist;
        double timeSoundEcho = 7.2;

        dist = (timeSoundEcho / 2) * speedSound;

        System.out.println("Расстояние до объекта: " + dist);

    }
}