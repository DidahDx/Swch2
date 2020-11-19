package com.app.swch.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.app.swch.R;
import com.app.swch.adapters.CirclesAdapter;
import com.app.swch.adapters.SquareAdapter;
import com.app.swch.adapters.ViewPagerEventsAdapter;
import com.app.swch.gson.EventGson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



/* renamed from: ke.swch.fragment.HomeFragment */
public class HomeFragment extends Fragment {
    private RecyclerView recyclerViewBars;
    private RecyclerView recyclerViewCircles;
    private RecyclerView recyclerViewClubs;
    private RecyclerView recyclerViewMightLike;
    private RecyclerView recyclerViewUpcoming;
    private ViewPager viewPager;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        collectViewIds(root);
        setupViews();
        return root;
    }

    private void collectViewIds(View view) {
        this.viewPager = view.findViewById(R.id.viewpager);
        this.recyclerViewCircles =  view.findViewById(R.id.rv_circles);
        this.recyclerViewUpcoming =  view.findViewById(R.id.rv_upcoming);
        this.recyclerViewMightLike = view.findViewById(R.id.rv_might_like);
        this.recyclerViewClubs = view.findViewById(R.id.rv_clubs);
        this.recyclerViewBars =  view.findViewById(R.id.rv_bars);
    }

    private void setupViews() {
        setupViewPager(this.viewPager);
        setupRecyclerCircles(this.recyclerViewCircles);
        setupRecyclerUpcoming(this.recyclerViewUpcoming);
        setupRecyclerUpcoming(this.recyclerViewMightLike);
        setupRecyclerUpcoming(this.recyclerViewClubs);
        setupRecyclerUpcoming(this.recyclerViewBars);
    }

    private void setupViewPager(ViewPager viewPager2) {
        viewPager2.setAdapter(new ViewPagerEventsAdapter(getChildFragmentManager(), 0, getEvents()));
    }

    private void setupRecyclerCircles(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        recyclerView.setAdapter(new CirclesAdapter(getContext(), getEvents()));
    }

    private void setupRecyclerUpcoming(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        recyclerView.setAdapter(new SquareAdapter(getContext(), getEvents()));
    }

    private List<EventGson> getEvents() {
        try {
            InputStream is = getResources().openRawResource(R.raw.mm);
            byte[] buffer = new byte[is.available()];
            is.read(buffer);
            is.close();
            String json = new String(buffer, StandardCharsets.UTF_8);
            Gson gson = new GsonBuilder().serializeNulls().serializeSpecialFloatingPointValues().create();
            List<EventGson> events = new ArrayList<>();
            events.addAll(Arrays.asList(gson.fromJson(json, EventGson[].class)));
            Collections.shuffle(events);
            return events;
        } catch (IOException e) {
            return new ArrayList();
        }
    }
}
