package Practice1.Task1;

public class Runner {
    public static void main(String[] args) {
        char[] charArray = {'1', '2', '3'};
        int intArray = 0;
        for (int i = 0; i < charArray.length; i++) {
            intArray = Character.getNumericValue(charArray[i]);
            System.out.print(intArray);
        }
    }
}
