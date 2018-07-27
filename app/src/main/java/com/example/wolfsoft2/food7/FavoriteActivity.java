package com.example.wolfsoft2.food7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.FavAdapterRecycler;
import model.FavoriteModel;

public class FavoriteActivity extends AppCompatActivity {

    Integer[] img = {R.drawable.img1,R.drawable.img2};
    String[] TEXT = {"textrecycler","textrecycler1","textrecycler2"};



    private FavAdapterRecycler adapterRecycler;
    private RecyclerView recyclerView;
    private ArrayList<FavoriteModel> modelRecyclerArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorites);

        recyclerView = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(FavoriteActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        modelRecyclerArrayList = new ArrayList<>();
//        for (int i = 0; i < (img.length);i++) {
//            ModelRecycler modelRecycler = new ModelRecycler();
//            modelRecycler.setImg1(img[i]);
//            modelRecycler.setImga2(img[i]);
//            modelRecycler.setText(TEXT[i]);
//
//
//            modelRecyclerArrayList.add(modelRecycler);

        FavoriteModel model = new FavoriteModel(R.drawable.img1,"Wild Honey at Scotts Square","473 Keeling Station","238 reviews");
            modelRecyclerArrayList.add(model);
        FavoriteModel model1 = new FavoriteModel(R.drawable.img2,"Wild Honey at Scotts Square","473 Keeling Station","238 reviews");
        FavoriteModel model2 = new FavoriteModel(R.drawable.img1,"Wild Honey at Scotts Square","473 Keeling Station","238 reviews");
        FavoriteModel model3 = new FavoriteModel(R.drawable.img2,"Wild Honey at Scotts Square","473 Keeling Station","238 reviews");
        modelRecyclerArrayList.add(model1);

        modelRecyclerArrayList.add(model2);

        modelRecyclerArrayList.add(model3);

        adapterRecycler = new FavAdapterRecycler(FavoriteActivity.this, modelRecyclerArrayList);
        recyclerView.setAdapter(adapterRecycler);

    }

    }

