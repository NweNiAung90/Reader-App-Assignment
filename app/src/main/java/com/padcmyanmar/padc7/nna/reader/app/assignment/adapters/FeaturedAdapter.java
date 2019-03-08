package com.padcmyanmar.padc7.nna.reader.app.assignment.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.padc7.nna.reader.app.assignment.R;
import com.padcmyanmar.padc7.nna.reader.app.assignment.holders.FeaturedViewHolder;
import com.padcmyanmar.padc7.nna.reader.app.assignment.holders.NewArrivalsViewHolder;

public class FeaturedAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = layoutInflater.inflate(R.layout.view_item_featured,viewGroup,false);
        return  new FeaturedViewHolder(itemView);    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
