package com.padcmyanmar.padc7.nna.reader.app.assignment.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.padc7.nna.reader.app.assignment.R;
import com.padcmyanmar.padc7.nna.reader.app.assignment.adapters.NewArrivalsAdapter;
import com.padcmyanmar.padc7.nna.reader.app.assignment.adapters.PopularAdapter;

public class PopularFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_popular,container,false);

        RecyclerView rvPopular = view.findViewById(R.id.rv_popular);
        rvPopular.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false));

        PopularAdapter popularAdapter = new PopularAdapter();
        rvPopular.setAdapter(popularAdapter);
        return view;
    }
}
