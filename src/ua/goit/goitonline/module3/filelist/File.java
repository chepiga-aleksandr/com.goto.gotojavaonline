package ua.goit.goitonline.module3.filelist;

import java.util.List;

public class File {
    private List<Txtfile> txtfiles;
    private List<Imgfile> imgfiles;
    private List<Audiofile> audiofiles;
    private List<Directory> directories;

    public List<Txtfile> getTxtfiles() {
        return txtfiles;
    }

    public void setTxtfiles(List<Txtfile> txtfiles) {
        this.txtfiles = txtfiles;
    }

    public List<Imgfile> getImgfiles() {
        return imgfiles;
    }

    public void setImgfiles(List<Imgfile> imgfiles) {
        this.imgfiles = imgfiles;
    }

    public List<Audiofile> getAudiofiles() {
        return audiofiles;
    }

    public void setAudiofiles(List<Audiofile> audiofiles) {
        this.audiofiles = audiofiles;
    }

    public List<Directory> getDirectories() {
        return directories;
    }

    public void setDirectories(List<Directory> directories) {
        this.directories = directories;
    }
}
