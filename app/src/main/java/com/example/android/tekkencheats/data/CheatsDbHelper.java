package com.example.android.tekkencheats.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by amigo on 6/2/17.
 */

public class CheatsDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "cheatlist.db";

    private static final int DATABASE_VERSION = 1;

    public CheatsDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        final String SQL_CREATE_CHEATS_TABLE = "CREATE TABLE " + CheatsContract.CheatList.TABLE_NAME  +"("
                + CheatsContract.CheatList._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + CheatsContract.CheatList.CHEAT_CATEGORY + " TEXT NOT NULL,"
                + CheatsContract.CheatList.CHEAT_NAME + " TEXT NOT NULL,"
                + CheatsContract.CheatList.CHEAT_DESCRIPTION + " TEXT NOT NULL"
                + "); " ;
        db.execSQL(SQL_CREATE_CHEATS_TABLE);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        //This is just a temporary code, requires updating before launch
        db.execSQL("DROP TABLE IF EXISTS " + CheatsContract.CheatList.TABLE_NAME);
        onCreate(db);
    }
}
