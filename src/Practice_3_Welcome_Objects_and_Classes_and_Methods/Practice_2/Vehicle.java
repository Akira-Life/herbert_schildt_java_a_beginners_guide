package Practice_3_Welcome_Objects_and_Classes_and_Methods.Practice_2;

public class Vehicle {
    int passenger; //количество пассажиров
    int fuelcap;   //емкость топливного бака
    int mpg;       //потребление топлива в милях на галон

    //конструктор класса Vehicle
    Vehicle(int p, int f, int m) {
        passenger = p;
        fuelcap = f;
        mpg = m;
    }

    //определение дальности поездки транспортного средства
    int range() { return mpg * fuelcap; }

    //расчет объема топлива, необходимого транспортному
    // средству для преодоления заданного расстояния
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class VehConsDemo {
    public static void main(String[] args) {
        //завершение создания объектов транспортных средств
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоление " + dist +
                            " миль мини-фургону требуется " +
                            gallons + " галлонов топлива");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist +
                            " миль спортивному автомобилю требуется " +
                            gallons + " галонов топлива");
    }
}
