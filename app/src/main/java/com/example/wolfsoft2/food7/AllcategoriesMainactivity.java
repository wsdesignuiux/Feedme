package com.example.wolfsoft2.food7;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

import adapter.AllcategoriesAdapter;
import adapter.StarterFragmentAdapter;
import model.AllcategoriesModel;

public class AllcategoriesMainactivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    StarterFragmentAdapter starterFragmentAdapter;


      private AllcategoriesAdapter allcategoriesAdapter;
      private RecyclerView recyclerView;
      private ArrayList <AllcategoriesModel> allcategoriesModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.allcategories_activity_main);


        tabLayout=findViewById(R.id.tablayout);

        viewPager=findViewById(R.id.viewpager);


        tabLayout.addTab(tabLayout.newTab().setText("STARTERS"));
        tabLayout.addTab(tabLayout.newTab().setText("MAINS"));
        tabLayout.addTab(tabLayout.newTab().setText("SIDES"));
        tabLayout.addTab(tabLayout.newTab().setText("DESSERT"));

        starterFragmentAdapter= new StarterFragmentAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setOffscreenPageLimit(4);
        viewPager.setAdapter(starterFragmentAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tabLayout.getSelectedTabPosition());

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
