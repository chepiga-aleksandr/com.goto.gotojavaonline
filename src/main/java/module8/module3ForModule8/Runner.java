package module8.module3ForModule8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.io.File;

public class Runner {
    public static void main(String[] args) {

        ArrayList<String> nameOfAudioFiles = new ArrayList<>();
        Audiofile audiofile = new Audiofile();

        String[] audioNames = new File(Audiofile.getPath()).list();

        System.out.println(Arrays.toString(audioNames));


//        for (int i = 0; i < list.length; i++) {
//
//            File f1 = new File(Audiofile.path() + Audiofile.list[i]);
//            System.out.println("Имя файла   " + Audiofile.getPath() + list[i] +
//                    "     Размер файла     " + f1.length() + "  байт");
//

//LinkedList
//        List<String> filePath = new LinkedList<>();
//        filePath.add(Audiofile.getPath());
//        filePath.add(Txtfile.getPath());
//        filePath.add(Imgfile.getPath());
//        System.out.println(filePath);
//ArrayList
//    ArrayList<File> fileName = new ArrayList<>();
//        for (int i=0; i < Audiofile.path().length(); i++ ) {
//       System.out.println(Audiofile.path());
    }
  }

//    String[] fileName = new File(getPath()).list();
//    Employee[] staff = new Employee[actualSize];
//    ArrayList<Employee> staff = new ArrayList<Employee>();


