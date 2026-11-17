class ABC{
    int x = 30;
}

public class DeepCopy {
    public static void main(String[] args) {
        ABC obj1 = new ABC();

        ABC obj2 = new ABC();

        obj2.x = 100;

        System.out.printf("value of x : %d" , obj1.x);
        System.out.printf("value of x : %d" , obj2.x);
    }
}
