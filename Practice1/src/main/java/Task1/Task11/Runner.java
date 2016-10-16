package Task1.Task11;

public class Runner {

    public static void main(String[] args) {
        char[] charArray = {'1', '2', '3'};

        String charToString = new String(charArray);

        try {
            System.out.println(Integer.parseInt(charToString));

        } catch (Exception e) {
            System.out.println("Входная строка содержит некорректные символы");
        }
    }
}
