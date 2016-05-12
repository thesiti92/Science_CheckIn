package com.milton.aians.science_checkin;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.util.Log;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;

public class studentData extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "studentData.sqlite";
    private static final int DATABASE_VERSION = 1;

    public studentData(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

        // you can use an alternate constructor to specify a database location
        // (such as a folder on the sd card)
        // you must ensure that this folder is available and you have permission
        // to write to it
        //super(context, DATABASE_NAME, context.getExternalFilesDir(null).getAbsolutePath(), null, DATABASE_VERSION);

    }

    public Cursor getStudents (){

        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM studentData", null);
        c.moveToFirst();
        return c;

    }
    public ArrayList<String> getNames(Context c)
    {

        for(int i=0; i<cursor.getCount(); i++)
        {
            Log.e("yay", cursor.getString(1));
            cursor.moveToNext();
        }
    }

}