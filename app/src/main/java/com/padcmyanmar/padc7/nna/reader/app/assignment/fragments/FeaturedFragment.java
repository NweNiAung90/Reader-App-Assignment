package com.padcmyanmar.padc7.nna.reader.app.assignment.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.padc7.nna.reader.app.assignment.R;
import com.padcmyanmar.padc7.nna.reader.app.assignment.adapters.FeaturedAdapter;

public class FeaturedFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_featured, container, false);
        RecyclerView rvFeatured = view.findViewById(R.id.rv_featured);
        rvFeatured.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false));

        FeaturedAdapter featuredAdapter = new FeaturedAdapter();
        rvFeatured.setAdapter(featuredAdapter);
        return view;
    }
}
