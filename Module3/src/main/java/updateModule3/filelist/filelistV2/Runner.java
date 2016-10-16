package updateModule3.filelist.filelistV2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static FileSize fileSize;

    public static void main(String[] args) throws IOException {

        Audiofile audiofile = new Audiofile();
        fileSize = audiofile;

        System.out.println("Размеры аудиофайлов - ");
        audiofile.size();

        Imgfile imgfile = new Imgfile();
        fileSize = imgfile;

        System.out.println("Размеры файлов изображений - ");
        imgfile.size();

        final BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));

        System.out.println();

        System.out.println("Вы уверены, что хотите удалить директорию, если да,то укажите Yes, если нет, то No:");

        String s = BUFFERED_READER.readLine();

        switch (s) {
            case "Yes":
                Directory.onDelete();
                break;
            case "No":
                break;
            default:
                break;
        }
        System.out.println("Вы настаиваете на удалении?, если да,то укажите Yes, если нет, то No:");

        String s1 = BUFFERED_READER.readLine();

        switch (s1) {
            case "Yes":
                Directory.recursiveDelete(new File(Directory.folder));
                break;
            case "No":
                break;
            default:
                break;
        }
    }
}