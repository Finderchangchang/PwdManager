package yy.pwdmanager.model;

import cn.bmob.v3.BmobObject;

/**
 * Created by Finder丶畅畅 on 2016/12/31 09:51
 * QQ群481606175
 */

public class MianShi extends BmobObject {
    public String id;
    private String title;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
