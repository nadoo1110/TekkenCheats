package com.example.android.tekkencheats;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.android.tekkencheats.data.CheatsContract;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>{

    // cursor that contains the category data
    private Cursor mCursor;
    private Context mContext;


    //Constructor

    public CategoryAdapter(Context context, Cursor cursor){
        this.mContext = context;
        this.mCursor =cursor;
    }

    @Override
    public CategoryAdapter.CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.tricktype_list_item, parent , false);
        return new CategoryViewHolder(view);

    }

    @Override
    public void onBindViewHolder(CategoryAdapter.CategoryViewHolder holder, int position) {

        // move the mCursor to the position to be displayed
        if(!mCursor.moveToPosition(position)){
            return;
        }
        String category = mCursor.getString(mCursor.getColumnIndex(CheatsContract.CheatList.CHEAT_CATEGORY));

        holder.categoryTextView.setText(category);
    }

    @Override
    public int getItemCount() {
        return mCursor.getCount();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder{

        TextView categoryTextView;
        //constructor

        public CategoryViewHolder( View itemView){
            super(itemView);
            categoryTextView = (TextView) itemView.findViewById(R.id.tv_tricktype_item);

        }

    }
}