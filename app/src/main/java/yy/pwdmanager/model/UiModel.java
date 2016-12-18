package yy.pwdmanager.model;

/**
 * Created by Finder丶畅畅 on 2016/12/18 00:59
 * QQ群481606175
 */

public class UiModel {
    String txt;
    int img;

    public UiModel(String txt, int img) {
        this.txt = txt;
        this.img = img;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
