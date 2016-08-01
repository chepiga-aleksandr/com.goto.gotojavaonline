package Practice1.Task2;

public class Runner {

    public static void main(String[] args) {
        int a = 666;
        int s = 0;
        do s = s + (a % 10);
        while ((a=a/10)!= 0);
        System.out.println(s + " ");
    }
}
