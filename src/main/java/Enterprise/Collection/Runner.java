package Enterprise.Collection;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Runner {

    public static void main(String[] args) {

        int[] arraySizeOfList = {10000,100000,1000000};
        int sizeOfList = arraySizeOfList.length;

        int numberOfTest = 100;

        long sumAddArray = 0;
        long sumGetArray = 0;
        long sumRemoveArray = 0;
        long sumContainsArray = 0;
        long sumListIterAddArray = 0;
        long sumListIterRemoveArray = 0;
        long sumAddLinked = 0;
        long sumGetLinked = 0;
        long sumRemoveLinked = 0;
        long sumContainsLinked = 0;
        long sumListIterAddLinked = 0;
        long sumListIterRemoveLinked = 0;
        long sumAddHash = 0;
        long sumContainsHash = 0;
        long sumRemoveHash = 0;
        long sumAddTree = 0;
        long sumContainsTree = 0;
        long sumRemoveTree = 0;

        String table = String.format("%-12s%-10s%-10s%-10s%-10s%-10s%-13s%-13s%n", "", "", "add", "get", "remove", "contains", "iterator.add", "iterator.remove");
        System.out.print(table);
        writeFile(table);

        for (int j = 0; j < sizeOfList; j++) {
            ArrayList arrayList = new ArrayList();
            int sizeOfListTemp = arraySizeOfList[j];

            for (int i = 0; i < numberOfTest; i++) {
                long sumAddArrayTemp = ListUtils.addList(arrayList, sizeOfListTemp);
                long sumGetArrayTemp = ListUtils.getList(arrayList, sizeOfListTemp);
                long sumRemoveArrayTemp = ListUtils.removeList(arrayList, sizeOfListTemp);
                long sumContainsArrayTemp = ListUtils.containsList(arrayList, sizeOfListTemp);
                long sumListIterAddArrayTemp = ListUtils.ListIteratorAdd(arrayList, sizeOfListTemp);
                long sumListIterRemoveArrayTemp = ListUtils.ListIteratorRemove(arrayList);
                ListUtils.clearList(arrayList);

                sumAddArray = sumAddArray + sumAddArrayTemp;
                sumGetArray = sumGetArray + sumGetArrayTemp;
                sumRemoveArray = sumRemoveArray + sumRemoveArrayTemp;
                sumContainsArray = sumContainsArray + sumContainsArrayTemp;
                sumListIterAddArray = sumListIterAddArray + sumListIterAddArrayTemp;
                sumListIterRemoveArray = sumListIterRemoveArray + sumListIterRemoveArrayTemp;
            }
            String tableArray = String.format("%-12s%-10d%-10d%-10d%-10d%-10d%-13d%-13d%n", "ArrayList", sizeOfListTemp, sumAddArray/numberOfTest, sumGetArray/numberOfTest, sumRemoveArray/numberOfTest, sumContainsArray/numberOfTest, sumListIterAddArray/numberOfTest, sumListIterRemoveArray/numberOfTest);
            System.out.print(tableArray);
            writeFile(tableArray);
        }

        for (int j = 0; j < sizeOfList; j++) {
            LinkedList linkedList = new LinkedList();
            int sizeOfListTemp = arraySizeOfList[j];

            for (int i = 0; i < numberOfTest; i++) {
                long sumAddLinkedTemp = ListUtils.addList(linkedList, sizeOfListTemp);
                long sumGetLinkedTemp = ListUtils.getList(linkedList, sizeOfListTemp);
                long sumRemoveLinkedTemp = ListUtils.removeList(linkedList, sizeOfListTemp);
                long sumContainsLinkedTemp = ListUtils.containsList(linkedList, sizeOfListTemp);
                long sumListIterAddLinkedTemp = ListUtils.ListIteratorAdd(linkedList, sizeOfListTemp);
                long sumListIterRemoveLinkedTemp = ListUtils.ListIteratorRemove(linkedList);
                ListUtils.clearList(linkedList);

                sumAddLinked = sumAddLinked + sumAddLinkedTemp;
                sumGetLinked = sumGetLinked + sumGetLinkedTemp;
                sumRemoveLinked = sumRemoveLinked + sumRemoveLinkedTemp;
                sumContainsLinked = sumContainsLinked + sumContainsLinkedTemp;
                sumListIterAddLinked = sumListIterAddLinked + sumListIterAddLinkedTemp;
                sumListIterRemoveLinked = sumListIterRemoveLinked + sumListIterRemoveLinkedTemp;
            }
            String tableLinked = String.format("%-12s%-10d%-10d%-10d%-10d%-10d%-13d%-13d%n", "LinkedList", sizeOfListTemp, sumAddLinked/numberOfTest, sumGetLinked/numberOfTest, sumRemoveLinked/numberOfTest, sumContainsLinked/numberOfTest, sumListIterAddLinked/numberOfTest, sumListIterRemoveLinked/numberOfTest);
            System.out.print(tableLinked);
            writeFile(tableLinked);
        }

        for (int j = 0; j < sizeOfList; j++) {
            HashSet hashset = new HashSet();
            int sizeOfListTemp = arraySizeOfList[j];

            for (int i = 0; i < numberOfTest; i++) {
                long sumAddHashTemp = SetUtils.addSet(hashset, sizeOfListTemp);
                long sumContainsHashTemp = SetUtils.containsSet(hashset, sizeOfListTemp);
                long sumRemoveHashTemp = SetUtils.removeSet(hashset, sizeOfListTemp);
                SetUtils.clearset(hashset);

                sumAddHash = sumAddHash + sumAddHashTemp;
                sumContainsHash = sumContainsHash + sumContainsHashTemp;
                sumRemoveHash = sumRemoveHash + sumRemoveHashTemp;

            }
            String tableSet = String.format("%-12s%-10d%-10d%-10s%-10d%-10d%-13s%-13s%n", "HashSet", sizeOfListTemp, sumAddHash/numberOfTest, "---", sumRemoveHash/numberOfTest, sumContainsHash/numberOfTest, "---", "---");
            System.out.print(tableSet);
            writeFile(tableSet);

        }
        for (int j = 0; j < sizeOfList; j++) {
            int sizeOfListTemp = arraySizeOfList[j];

            for (int i = 0; i < numberOfTest; i++) {
                TreeSet treeSet = new TreeSet();

                long sumAddTreeTemp = SetUtils.addSet(treeSet, sizeOfListTemp);
                long sumContainsTreeTemp = SetUtils.removeSet(treeSet, sizeOfListTemp);
                long sumRemoveTreeTemp = SetUtils.removeSet(treeSet, sizeOfListTemp);
                SetUtils.clearset(treeSet);

                sumAddTree = sumAddTree + sumAddTreeTemp;
                sumContainsTree = sumContainsTree + sumContainsTreeTemp;
                sumRemoveTree = sumRemoveTree + sumRemoveTreeTemp;
            }
            String tableTree = String.format("%-12s%-10d%-10d%-10s%-10d%-10d%-13s%-13s%n", "TreeSet", sizeOfListTemp, sumAddTree/numberOfTest, "---", sumRemoveTree/numberOfTest, sumContainsTree/numberOfTest, "---", "---");
            System.out.print(tableTree);
            writeFile(tableTree);
        }
    }

    private static void writeFile(String data) {
        File file = new File("e://collection.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file,true);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

