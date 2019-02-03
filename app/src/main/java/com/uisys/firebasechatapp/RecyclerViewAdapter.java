package com.uisys.firebasechatapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Admin on 10/6/18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.X> {


    @Override
    public X onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(X holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class X extends RecyclerView.ViewHolder
    {
        public X(View itemView) {
            super(itemView);
        }
    }

}
