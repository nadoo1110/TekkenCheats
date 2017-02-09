package com.example.android.tekkencheats;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.tekkencheats.data.CheatsContract;
import com.example.android.tekkencheats.data.CheatsData;
import com.example.android.tekkencheats.data.CheatsDbHelper;

public class MainActivity extends AppCompatActivity {


    private static final int NUM_LIST_ITEMS = 100;

    private CategoryAdapter mAdapter;

    private RecyclerView mTypeList;

    private SQLiteDatabase mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mTypeList = (RecyclerView) findViewById( R.id.rv_tricktype);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        mTypeList.setLayoutManager(layoutManager);


        // get the DB helper instance
        CheatsDbHelper cheatsDbHelper = new CheatsDbHelper(this);

        // get a writable database, Mostly to be changed to getReadableDatabase() since I may not use any insert command

        mDb = cheatsDbHelper.getWritableDatabase();

        // insert the data into the database referenced by mDb
        CheatsData.insertData(mDb);

        //get the cursor containing the cheats category

        Cursor cursor = getCheatsCategory();

        mAdapter = new CategoryAdapter(this, cursor);

        mTypeList.setAdapter(mAdapter);






    }

    public Cursor getCheatsCategory(){

        // get the data from the catefory column in the table using the query method

        //String[] column_category = {CheatsContract.CheatList.CHEAT_CATEGORY};
        return mDb.query(
                CheatsContract.CheatList.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                CheatsContract.CheatList._ID
        );
    }


}
