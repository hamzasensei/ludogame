package com.example.myludogame;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class sqlb4 extends SQLiteOpenHelper{
    String TABLE_NAME="phone";
    Context context;

    public static final String COL_2 = "NAME";
    public sqlb4(@Nullable Context context) {

        super(context, "dpp4", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (NAME TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists phone");
        onCreate(db);
    }

    public void update(String value) {
        SQLiteDatabase sd = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_2,value);
        sd.update(TABLE_NAME, cv,null, null);

    }
    public boolean insert(String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COL_2,name);

        long result = db.insert(TABLE_NAME,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }
    public int show() {
        String result="";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from " + TABLE_NAME, null);

        Cursor res = cursor;
        if (res.getCount() == 0) {
            result="fress";
        } else {
            StringBuffer buffer = new StringBuffer();
            while (res.moveToNext()) {
                buffer.append( res.getString(0) );
            }
            result=buffer.toString();
        }
        return Integer.parseInt(result);
    }
    public void delete() {
        SQLiteDatabase sd = this.getWritableDatabase();
        sd.execSQL("DELETE FROM "+TABLE_NAME);
    }


}
