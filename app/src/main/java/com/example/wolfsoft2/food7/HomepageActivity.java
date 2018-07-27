package com.example.wolfsoft2.food7;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.HomepageAdapter;
import adapter.TabHomepageAdapter;
import model.HomepageModel;

public class HomepageActivity extends AppCompatActivity {

    ViewPager viewPager1;
    TabLayout tabLayout1;
    TabHomepageAdapter adapter;


    private HomepageAdapter homepageAdapter;
    private RecyclerView recyclerview;
    private ArrayList<HomepageModel> homepageModelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepagefood);

        viewPager1 = findViewById(R.id.viewpager1);

        tabLayout1 = findViewById(R.id.tablayout1);

        tabLayout1.addTab(tabLayout1.newTab().setText("Nearby"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Popular"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Top review"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Recommended"));

        adapter = new TabHomepageAdapter(getSupportFragmentManager(),tabLayout1.getTabCount());
        viewPager1.setAdapter(adapter);
        viewPager1.setOffscreenPageLimit(4);
        viewPager1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout1));
        tabLayout1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager1.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }

    }

