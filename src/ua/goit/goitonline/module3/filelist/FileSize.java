package ua.goit.goitonline.module3.filelist;

import java.io.File;

public class FileSize {

        static String path;
        int i;
        String[] list = new File(getPath()).list();

        public String getPath() {
            return path;
        }

    public void size() {

        for (i = 0; i < list.length; i++) {

            File f1 = new File(getPath() + list[i]);
            System.out.println("Имя файла   " + list[i] + "     Размер файла     " + f1.length() + "  байт");
        }
    }
}
