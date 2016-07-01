package ua.goit.goitonline.module3.filelist;

import java.io.File;

public class FileSize {

        static private String path;
        String[] list = new File(getPath()).list();

        public String getPath() {
            return path;
        }

    public void size() {

        for (int i = 0; i < list.length; i++) {

            File f1 = new File(getPath() + list[i]);
            System.out.println("Имя файла   " + getPath() + list[i] + "     Размер файла     " + f1.length() + "  байт");
        }
    }
}
