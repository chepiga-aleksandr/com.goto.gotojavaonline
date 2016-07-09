package module3.updateModule3.filelist;

import java.io.File;

public class OnDeleteDirectoryWithSubFolder {

    static String folder = "d:\\111\\";

    public static void main(String[] args) {
        //    удаляем файл рекурсивно
        recursiveDelete(new File(folder));
    }

    public static void recursiveDelete(File file) {


//        String folder = "d:\\111\\";

 //       recursiveDelete(new File(folder));

        file.delete();

        // до конца рекурсивного цикла
        if (!file.exists())
            return;

        //если это папка, то идем внутрь этой папки и вызываем рекурсивное удаление всего, что там есть
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                // рекурсивный вызов
                recursiveDelete(f);
            }
        }
        // вызываем метод delete() для удаления файлов и пустых(!) папок
        file.delete();
        System.out.println("Удаленный файл или папка: " + file.getAbsolutePath());
    }

}



