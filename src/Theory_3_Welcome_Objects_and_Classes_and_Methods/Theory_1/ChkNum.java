package Theory_3_Welcome_Objects_and_Classes_and_Methods.Theory_1;

public class ChkNum {
    //возврат логическое значение true
    //если x содержит четное число

    boolean isEven(int x) {
        if (x % 2 == 0) return true;
        else return false;
    }
}

class ParmDemo {
    public static void main(String[] args) {
        ChkNum chkNum = new ChkNum();
        for (int i = 0; i < 100; i++) {
            if (chkNum.isEven(i)) {
                System.out.println(i + "Четное");
            }
        }
    }
}
