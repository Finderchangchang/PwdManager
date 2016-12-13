package yy.pwdmanager.listener;

import net.tsz.afinal.FinalDb;

import yy.pwdmanager.model.PwdTypeModel;
import yy.pwdmanager.view.IMain;

/**
 * Created by Finder丶畅畅 on 2016/12/13 23:54
 * QQ群481606175
 */

public class PwdTypeListener implements IPwdType {
    IMain iMain;
    FinalDb db;

    public PwdTypeListener(IMain iMain, FinalDb db) {
        this.iMain = iMain;
        this.db = db;
    }

    @Override
    public void addType(String type) {

    }

    @Override
    public void cshType() {
        db.save(new PwdTypeModel("通讯"));
        db.save(new PwdTypeModel("博客"));
    }

    @Override
    public void deleteTypeById(int id) {

    }

    @Override
    public void updateType(PwdTypeModel model) {

    }
}

interface IPwdType {
    void addType(String type);//添加分类

    void cshType();//初始化分类

    void deleteTypeById(int id);//根据id删除分类

    void updateType(PwdTypeModel model);//修改分类
}
