package Practice_1_Data_Types_and_Operators;
/*
    упражнение 2.1
    Вычислите растояние до места вспышки молнии, звук которого
    доходит до наблюдателя через 7.2 сек
 */
public class Practice_0_1_Data_Types_and_Operators {
    public static void main(String[] args) {
        double dist;
        dist = 7.2 * 1100;
        System.out.println("Растояние до места вспышки молнии " + dist);

        System.out.println("-------------");

        double time;
        time = (7.2 * 2) / 2;
        double dist2;
        dist2 = time * 1100;
        System.out.println("Время прихода эхо " + dist2);

        System.out.println("----\rурезанно?\r-----");
    }
}








