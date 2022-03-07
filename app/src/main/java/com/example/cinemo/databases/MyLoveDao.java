package com.example.cinemo.databases;

import android.content.Context;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

public class MyLoveDao implements IMenyInDaoModel {

    Dao<MyLoveBeans, Integer> dao;

    public MyLoveDao(Context context) {
        try {
            dao = MyDatabase.getInstance(context).getDao(MyLoveBeans.class);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public int add(Object weChtBeanIn) {
        int i = 0;
        try {
            i = dao.create((MyLoveBeans) weChtBeanIn);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return i;
    }

    @Override
    public int delect(int id) {
        return 0;
    }

    @Override
    public List<MyLoveBeans> quer() {
        List<MyLoveBeans> myLoveBeans = null;
        try {
            myLoveBeans = dao.queryForAll();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return myLoveBeans;
    }

    @Override
    public List<Object> querLike(String values) {
        return null;
    }
}
