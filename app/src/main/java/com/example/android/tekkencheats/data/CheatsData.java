package com.example.android.tekkencheats.data;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amigo on 6/2/17.
 */

public class CheatsData {

    // For testing the data entered is fake and this method requires updating pre-launch
    public static void insertData(SQLiteDatabase db){
        if(db == null){
            return;
        }

        List<ContentValues> list = new ArrayList<ContentValues>();

        ContentValues cv = new ContentValues();

        cv.put(CheatsContract.CheatList.CHEAT_CATEGORY , "categ 1" );
        cv.put(CheatsContract.CheatList.CHEAT_NAME , " cheat Name 1 ");
        cv.put(CheatsContract.CheatList.CHEAT_DESCRIPTION, " Follow these instructions to execute cheat 1");

        list.add(cv);

        cv = new ContentValues();

        cv.put(CheatsContract.CheatList.CHEAT_CATEGORY , "categ 2" );
        cv.put(CheatsContract.CheatList.CHEAT_NAME , " cheat Name 2 ");
        cv.put(CheatsContract.CheatList.CHEAT_DESCRIPTION, " Follow these instructions to execute cheat 2");

        list.add(cv);

        cv = new ContentValues();
        cv.put(CheatsContract.CheatList.CHEAT_CATEGORY , "categ 3" );
        cv.put(CheatsContract.CheatList.CHEAT_NAME , " cheat Name 3 ");
        cv.put(CheatsContract.CheatList.CHEAT_DESCRIPTION, " Follow these instructions to execute cheat 3");

        list.add(cv);

        cv = new ContentValues();
        cv.put(CheatsContract.CheatList.CHEAT_CATEGORY , "categ 3" );
        cv.put(CheatsContract.CheatList.CHEAT_NAME , " cheat Name 3 ");
        cv.put(CheatsContract.CheatList.CHEAT_DESCRIPTION, " Follow these instructions to execute cheat 3");

        list.add(cv);

        cv = new ContentValues();
        cv.put(CheatsContract.CheatList.CHEAT_CATEGORY , "categ 4" );
        cv.put(CheatsContract.CheatList.CHEAT_NAME , " cheat Name 4 ");
        cv.put(CheatsContract.CheatList.CHEAT_DESCRIPTION, " Follow these instructions to execute cheat 4");

        list.add(cv);

        cv = new ContentValues();
        cv.put(CheatsContract.CheatList.CHEAT_CATEGORY , "categ 5" );
        cv.put(CheatsContract.CheatList.CHEAT_NAME , " cheat Name 5 ");
        cv.put(CheatsContract.CheatList.CHEAT_DESCRIPTION, " Follow these instructions to execute cheat 5");

        list.add(cv);

        cv = new ContentValues();
        cv.put(CheatsContract.CheatList.CHEAT_CATEGORY , "categ 6" );
        cv.put(CheatsContract.CheatList.CHEAT_NAME , " cheat Name 6 ");
        cv.put(CheatsContract.CheatList.CHEAT_DESCRIPTION, " Follow these instructions to execute cheat 6");

        list.add(cv);

        cv = new ContentValues();
        cv.put(CheatsContract.CheatList.CHEAT_CATEGORY , "categ 7" );
        cv.put(CheatsContract.CheatList.CHEAT_NAME , " cheat Name 7 ");
        cv.put(CheatsContract.CheatList.CHEAT_DESCRIPTION, " Follow these instructions to execute cheat 7");

        list.add(cv);


        cv = new ContentValues();
        cv.put(CheatsContract.CheatList.CHEAT_CATEGORY , "categ 8" );
        cv.put(CheatsContract.CheatList.CHEAT_NAME , " cheat Name 8 ");
        cv.put(CheatsContract.CheatList.CHEAT_DESCRIPTION, " Follow these instructions to execute cheat 8");

        list.add(cv);


        cv = new ContentValues();
        cv.put(CheatsContract.CheatList.CHEAT_CATEGORY , "categ 9" );
        cv.put(CheatsContract.CheatList.CHEAT_NAME , " cheat Name 9 ");
        cv.put(CheatsContract.CheatList.CHEAT_DESCRIPTION, " Follow these instructions to execute cheat 9");

        list.add(cv);

        cv = new ContentValues();
        cv.put(CheatsContract.CheatList.CHEAT_CATEGORY , "categ 10" );
        cv.put(CheatsContract.CheatList.CHEAT_NAME , " cheat Name 10 ");
        cv.put(CheatsContract.CheatList.CHEAT_DESCRIPTION, " Follow these instructions to execute cheat 10");

        list.add(cv);


        cv = new ContentValues();
        cv.put(CheatsContract.CheatList.CHEAT_CATEGORY , "categ 11" );
        cv.put(CheatsContract.CheatList.CHEAT_NAME , " cheat Name 11 ");
        cv.put(CheatsContract.CheatList.CHEAT_DESCRIPTION, " Follow these instructions to execute cheat 112");

        list.add(cv);


        cv = new ContentValues();
        cv.put(CheatsContract.CheatList.CHEAT_CATEGORY , "categ 12" );
        cv.put(CheatsContract.CheatList.CHEAT_NAME , " cheat Name 12 ");
        cv.put(CheatsContract.CheatList.CHEAT_DESCRIPTION, " Follow these instructions to execute cheat 12");

        list.add(cv);


        cv = new ContentValues();
        cv.put(CheatsContract.CheatList.CHEAT_CATEGORY , "categ 13" );
        cv.put(CheatsContract.CheatList.CHEAT_NAME , " cheat Name 13 ");
        cv.put(CheatsContract.CheatList.CHEAT_DESCRIPTION, " Follow these instructions to execute cheat 13");

        list.add(cv);

        cv = new ContentValues();
        cv.put(CheatsContract.CheatList.CHEAT_CATEGORY , "categ 13" );
        cv.put(CheatsContract.CheatList.CHEAT_NAME , " cheat Name 13 ");
        cv.put(CheatsContract.CheatList.CHEAT_DESCRIPTION, " Follow these instructions to execute cheat 13");

        list.add(cv);

        try{
            db.beginTransaction();

            // clear the table

            db.delete(CheatsContract.CheatList.TABLE_NAME, null, null);

            // add the values in cv list

            for ( ContentValues contentValues: list){
                db.insert(CheatsContract.CheatList.TABLE_NAME, null, contentValues);
            }
            db.setTransactionSuccessful();


        }
        catch ( SQLiteException e){
            //catch it, print stack trace
        }
        finally {
            db.endTransaction();
        }










    }
}
