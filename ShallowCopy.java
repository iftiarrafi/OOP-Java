class ABC{
    int x = 30;
}

public class ShallowCopy {
    public static void main(String[] args) {
        ABC obj1 = new ABC();

        ABC obj2 = obj1;

        obj2.x = 100;

        System.out.printf("value of x : %d" , obj1.x);
    }
}
