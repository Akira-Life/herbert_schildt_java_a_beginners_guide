package Theory_3_Welcome_Objects_and_Classes_and_Methods.Theory_1;

public class Vehicle {
    int passengers; //кол. пассажиров
    int fuelcap;    //емкость топливного бака
    int mpg;        //потребеление топлива в милях на галон

    int range() {
        return fuelcap * mpg;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle miniven2 = new Vehicle();
        int range;

        // Присваивание значение полям в объекте minivan
        miniven2.passengers = 7;
        miniven2.fuelcap = 16;
        miniven2.mpg = 22;

        //рассчет дальности поездки с полным баком горючего
        range = miniven2.fuelcap * miniven2.mpg;
        System.out.println(miniven2.range());
        System.out.println("Мини фургон может перевезти " + miniven2.passengers + " пассажиров на растояние " +
                            range + " миль");


    }
}

class TwoVehicles {
    public static void main(String[] args) {
        Vehicle miniven1 = new Vehicle();  //   КАЖДЫЙ ОБЪЕКТ СОДЕРЖИТ КОПИИ МЕРЕМЕННЫХ ЭКЗЕМПЛЯРА
        Vehicle sportscar = new Vehicle();
        double gallons1, gallons2;
        int dist = 252;

        int range1, range2;
        //присваивание полям объекта miniven
        miniven1.passengers = 7;
        miniven1.fuelcap = 16;
        miniven1.mpg = 21;

        //присваивание полям объекта sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons1 = miniven1.fuelneeded(dist);
        gallons2 = sportscar.fuelneeded(dist);

        //расчет дальности поездки с полным баком горючего
        range1 = miniven1.fuelcap * miniven1.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Мини-фургон может перевезти " + miniven1.passengers +
                            " на расстояние " + range1 + " миль");
        System.out.println("Спортивный автомобиль может перевезти " + sportscar.passengers +
                            " пассажиров на расстояние " + range2 + "миль");

        System.out.println(miniven1.range());
        System.out.println(sportscar.range());
    }
}
