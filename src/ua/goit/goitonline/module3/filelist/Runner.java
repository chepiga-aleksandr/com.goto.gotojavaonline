package ua.goit.goitonline.module3.filelist;

public class Runner {

    static class RunnerFileSize {

        static FileSize fileSize;

        public static void main(String[] args) {

            Audiofile audiofile = new Audiofile();
            fileSize = audiofile;

            System.out.println("Размеры аудиофайлов");
            audiofile.size();

            Imgfile imgfile = new Imgfile();
            fileSize = imgfile;

            System.out.println("размеры картинок");
            imgfile.size();

        }
    }
}

