package FinalProjectCoreJava;

import java.util.Arrays;

public class GenerateCardNumber {
    public static String[] generateCardNumber() {
        int amountOfCards = 5;
        String[] listOfNumberCard = new String[amountOfCards];

        String BIN = "555555";
        String IDCard = "1111111111";

        int[] BINInt = new int[BIN.length()];
        int[] IDCardInt = new int[IDCard.length()];

        for (int i = 0; i < BIN.length(); i++) {
            char c = BIN.charAt(i);
            int x = Character.getNumericValue(c);
            BINInt[i] = x;
        }

        int[] BINIntCopy = (BINInt.clone());

        int binSum = 0;
        int IDCardSum10 = 0;

        for (int i = 0; i < BINIntCopy.length; i++) {
            if (i % 2 == 0) {
                BINIntCopy[i] = BINIntCopy[i] * 2;
                if (BINIntCopy[i] > 9) {
                    BINIntCopy[i] -= 9;
                }
            }
            binSum = binSum + BINInt[i];
        }

        char lastNumberChar = IDCard.charAt(IDCard.length() - 1);
        int lastNumber = Character.getNumericValue(lastNumberChar) + 1;

        StringBuilder sb = new StringBuilder();
        long IDCardInteger = Long.valueOf(IDCard);
        int IDCardSum9 = 0;

        for (int i = 0; i < amountOfCards; i++) {
            String IDCardString = String.format("%010d", IDCardInteger);

            for (int g = 0; g < IDCard.length(); g++) {
                char c = IDCardString.charAt(i);
                int x = Character.getNumericValue(c);
                IDCardInt[g] = x;
            }

            int[] IDCardIntCopy = (IDCardInt.clone());
            int[] IDCardIntTemp = (IDCardInt.clone());

            for (int j = 0; j < IDCardIntCopy.length; j++) {
                if (j % 2 == 0) {
                    IDCardIntCopy[j] = IDCardIntCopy[j] * 2;
                    if (IDCardIntCopy[j] > 9) {
                        IDCardIntCopy[j] -= 9;
                    }
                }
                IDCardSum10 = IDCardSum10 + IDCardIntCopy[j];
            }

            for (int w = 0; w < IDCardIntTemp.length - 1; w++) {
                if (w % 2 == 0) {
                    IDCardIntTemp[w] = IDCardIntTemp[w] * 2;
                    if (IDCardIntTemp[w] > 9) {
                        IDCardIntTemp[w] -= 9;
                    }
                }
                IDCardSum9 = IDCardSum9 + IDCardIntTemp[w];
            }

            IDCardSum9 = IDCardSum9 + binSum;
            int IDCardSum9Final = IDCardSum9 * 9;
            int finalSum10 = IDCardSum10 + binSum;

            String IDCardSum9String = String.valueOf(IDCardSum9Final);

            char c = IDCardSum9String.charAt(IDCardSum9String.length() - 1);
            int a = Character.getNumericValue(c);

//            if (finalSum10 % 10 == 0) {
            if (finalSum10 % 10 == 0 && lastNumber == a) {
//          if (lastNumber == a) {
                int[] numberCard = new int[BINInt.length + IDCardInt.length];
                System.arraycopy(BINInt, 0, numberCard, 0, BINInt.length);
                System.arraycopy(IDCardInt, 0, numberCard, BINInt.length, IDCardInt.length);

                for (int aNumberCard : numberCard) {
                    sb.append(aNumberCard);
                }
                listOfNumberCard[i] = sb.toString();
            }
            IDCardInteger++;
        }
        return listOfNumberCard;
    }

    public static void main(String[] args) {

//        GenerateCardNumber.generateCardNumber();

        System.out.println(Arrays.toString(GenerateCardNumber.generateCardNumber()));
    }
}

