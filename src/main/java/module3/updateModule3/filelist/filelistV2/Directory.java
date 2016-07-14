package module3.updateModule3.filelist.filelistV2;

import java.io.File;

class Directory {

    private String path;
    public static String folder = "d:\\111\\";

    public static void onDelete() {

        File file = new File(folder);

        if (file.delete()) {
            System.out.println("Ваша папка удалена");
        } else System.out.println("Эта папка не пуста!");
    }

    public static void recursiveDelete(File file) {

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

    public String getPath() {

        return path;
    }
    public void setPath(String path)  {

        this.path = path;
    }
}








