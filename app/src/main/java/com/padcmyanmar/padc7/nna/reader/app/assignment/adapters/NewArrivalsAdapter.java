package com.padcmyanmar.padc7.nna.reader.app.assignment.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.padc7.nna.reader.app.assignment.R;
import com.padcmyanmar.padc7.nna.reader.app.assignment.holders.NewArrivalsViewHolder;

public class NewArrivalsAdapter extends RecyclerView.Adapter  {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = layoutInflater.inflate(R.layout.view_item_new_arrivals,viewGroup,false);
        return  new NewArrivalsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
