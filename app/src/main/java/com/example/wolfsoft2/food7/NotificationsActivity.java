package com.example.wolfsoft2.food7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import adapter.NotificationsAdapter;
import model.NotificationsModel;


public class NotificationsActivity extends AppCompatActivity {
    TextView textView;

    private ArrayList<NotificationsModel> modelfoodrecyclerArrayList;
    private RecyclerView recyclerview;
    private NotificationsAdapter adapter;

    Integer Foodimg1[] = {R.drawable.img1,R.drawable.img2,R.drawable.img1,R.drawable.img2};
    String foodtext1[] = {"Make Grilling A Healthy Experience","Planning Helps Make A Party Perfect ","Cast Iron Cookware","Smarter Food Choices 101 Tips For Busy Women"};
    String foodtext2[] = {"If you’re cooking your food properly on your barbeque, you’re getting delightful results every time. ","Proper cookery renders good food material more digestible. ","Many people understand the concept of passive solar for heating a home. ","Fish is one of the most wholesome   foods that man can eat."};
    String foodtext3[] = {"20 mins","2 hours","Yesterday","3 days"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notifications);


        recyclerview = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(NotificationsActivity.this);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        modelfoodrecyclerArrayList = new ArrayList<>();

        for (int i = 0; i < Foodimg1.length; i++) {
           NotificationsModel vrusti = new NotificationsModel(Foodimg1[i],foodtext1[i],foodtext2[i],foodtext3[i]);
            modelfoodrecyclerArrayList.add(vrusti);
        }
       adapter = new NotificationsAdapter(NotificationsActivity.this,modelfoodrecyclerArrayList);
        recyclerview.setAdapter(adapter);
    }

}

