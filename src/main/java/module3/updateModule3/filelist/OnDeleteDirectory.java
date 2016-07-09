package eeee.module3.updateModule3.filelist;

import java.io.File;

public class OnDeleteDirectory {

    public static void onDelete() {

        File file = new File("d:\\111\\");

        if (file.delete()) {
            System.out.println("Ваша папка удалена");
        } else System.out.println("Эта папка не пуста!");
    }

    public static class onDeleteDirectory1 {

        public static void recursiveDelete() {

            String folder = "d:\\111\\";
            File file1 = new File(folder);
            recursiveDelete();

            file1.delete();

            // до конца рекурсивного цикла
            if (!file1.exists())
                return;

            //если это папка, то идем внутрь этой папки и вызываем рекурсивное удаление всего, что там есть
            if (file1.isDirectory()) {
                for (File f : file1.listFiles()) {
                    // рекурсивный вызов
                    recursiveDelete();
                }
            }
            // вызываем метод delete() для удаления файлов и пустых(!) папок
            file1.delete();
            System.out.println("Удаленный файл или папка: " + file1.getAbsolutePath());
        }

    }
}