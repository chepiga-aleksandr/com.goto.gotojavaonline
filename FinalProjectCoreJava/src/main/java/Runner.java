public class Runner {
    public static void main(String[] args) {
//        int[] array = {2,2,6,5,7,8,9,3,0,4};
        String card = "1111111111";

        int sum = AlgoritmLuna.getControlSum(card);

        System.out.println(sum);

        AlgoritmLuna.getControlNumber(sum);
        System.out.println(sum%10);
    }
}
