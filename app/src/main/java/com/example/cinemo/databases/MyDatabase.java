package com.example.cinemo.databases;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

/**
 * 作者：格物
 * 时间：
 * 描述：数据库单例
 */
public class MyDatabase extends OrmLiteSqliteOpenHelper {

    private static final String databaseName = "BOOK.db";
    private static final SQLiteDatabase.CursorFactory factory = null;
    private static final int databaseVersion = 1;
    private static MyDatabase myDatabase;


    public MyDatabase(Context context) {
        super(context, databaseName, factory, databaseVersion);
    }

    public static synchronized MyDatabase getInstance(Context context) {
        if (myDatabase == null) {
            synchronized (MyDatabase.class) {
                if (myDatabase == null) {
                    myDatabase = new MyDatabase(context);
                }
            }
        }
        return myDatabase;
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, MyLoveBeans.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i1) {

    }
}
