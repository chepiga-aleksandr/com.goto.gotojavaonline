package Task1;

public class Runner {
    public static void main(String[] args) {
        char[] charArray = {'1', '2', '3'};

        StringBuilder charToString = new StringBuilder();

        try {
            for (int i = 0; i < charArray.length; i++) {

                charToString.append(charArray[i]);
            }
            System.out.println(Integer.parseInt(charToString.toString()));

        } catch (Exception e) {
            System.out.println("Входная строка содержит некорректные символы");
        }
    }
}
