package com.postapp.mydemo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

@SuppressLint("ValidFragment")
public class SimpleCardFragment extends Fragment {
    private String mTitle;
    RecyclerView recyclerView;
    List<String> strings = new ArrayList<>();
    AllThemeAdpter allThemeAdpter;
    private long long_dy = 0;

    public static SimpleCardFragment getInstance(String title) {
        SimpleCardFragment sf = new SimpleCardFragment();
        sf.mTitle = title;
        return sf;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fr_simple_card, null);
        recyclerView = v.findViewById(R.id.recy);
        for (int i = 0; i < 20; i++) {
            strings.add(mTitle + i);
        }
        allThemeAdpter = new AllThemeAdpter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        allThemeAdpter.isFirstOnly(false);
        recyclerView.setAdapter(allThemeAdpter);
        allThemeAdpter.setNewData(strings);

        return v;
    }
}