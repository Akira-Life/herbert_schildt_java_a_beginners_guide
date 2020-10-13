package Practice_3_Welcome_Objects_and_Classes_and_Methods.Practice_2;

public class ParmConsDemo {
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass(22);
        MyClass myClass2 = new MyClass(44);

        System.out.println(myClass1.x + " " + myClass2.x);
        //одна и та же переменная заданная через разные объекты имеет разные значения
    }
}
