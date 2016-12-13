package yy.pwdmanager.model;

/**
 * 密码分类model
 * Created by Finder丶畅畅 on 2016/12/13 23:52
 * QQ群481606175
 */

public class PwdTypeModel {
    int id;
    String type;

    public PwdTypeModel() {

    }

    public PwdTypeModel(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
