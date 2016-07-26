package Practice1;

public class MergingNumbers {
    public static void main(String[] args) {
//        char[] charArray = {'1', '2', '3'};
          char ch = '8';
        int intArray = 0;
//        for (int i = 0; i < charArray.length; i++) {
            intArray = Character.getNumericValue(ch);
        System.out.println("Number" + intArray);
       }
}
//Объединить массив символов в число.
//Пример: Для [ '1', '2', '3'] ...
// int i1 = Character.getNumericValue(ch);