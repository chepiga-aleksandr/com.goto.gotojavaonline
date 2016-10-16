package Task4;

public class Runner {

    private String BASEOFLETTERS = "abcdefghij";
    private boolean checkFlag = true;

    public boolean checkData(String stringInput) {
        boolean isContains = true;
        for (int i = 0; i < stringInput.length(); i++) {
            String temp = stringInput.valueOf(stringInput.toLowerCase().charAt(i));

            if (!isContains == BASEOFLETTERS.contains(temp)) {
                checkFlag = false;
                System.out.println("Входные данные некорректны");
                break;
            } else {
                checkFlag = true;
            }
        }
        return checkFlag;
    }

    public int convertStringForInt(String stringInput) {

        StringBuilder numbers = new StringBuilder();
        int result;

        for (int i = 0; i < stringInput.length(); i++) {
            numbers.append(BASEOFLETTERS.indexOf(stringInput.toLowerCase().charAt(i)));
        }
        result = Integer.parseInt(numbers.toString());
        return result;
    }

    public static void main(String[] args) {

        Runner runner = new Runner();

        String inputData = "gf";

        if (runner.checkData(inputData)) {
            int x = runner.convertStringForInt(inputData);
            System.out.println(x);
        }
    }
}
