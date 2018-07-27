package com.example.wolfsoft2.food7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import adapter.ReviewsAdapter;
import model.ReviewsModel;

public class ReviewsActivity extends AppCompatActivity {
    TextView textView;

    private ArrayList<ReviewsModel> modelRecyclerFood14ArrayList;
    private RecyclerView recyclerview;
    private ReviewsAdapter adapter_recyclerfood14;

    String foodtext1[] = {"Ellen McLaughlin","Vincent King","Francisco Lowe"};
    String foodtext2[] = {"2 hours ago","2 hours ago","2 hours ago"};
    String foodtext3[] = {"So we needed up ordering the deep fried salmon roll with Chinese hot mustard and wasabi noodles with salmon.","We been there yesterday for dinner,ordered tandoori lobster and mutton galouti and few mains and biryani.","I was there for sister birthday party ,I have been here for first time ,very impressed with overall experience.great food ,service and ambience was excellent."};
    String foodtext4[] = {"25 Reviews","25 Reviews","25 Reviews"};


    Integer circleviewimg1[] = {R.drawable.img14a,R.drawable.img14b,R.drawable.img14a};
    Integer foodimg1[] = {R.drawable.img1,R.drawable.img2,R.drawable.img1};
    Integer foodimg2[] = {R.drawable.img1,R.drawable.img2,R.drawable.img1};
    Integer foodimg3[] = {R.drawable.img1,R.drawable.img2,R.drawable.img1};
    Integer foodimg4[] = {R.drawable.img1,R.drawable.img2,R.drawable.img1};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reviews);

        recyclerview = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( ReviewsActivity.this);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        modelRecyclerFood14ArrayList = new ArrayList<>();


        for (int i = 0; i < foodimg1.length; i++) {
            ReviewsModel view1 = new ReviewsModel(foodtext1[i],foodtext2[i],foodtext3[i],foodtext4[i],circleviewimg1[i],foodimg1[i],foodimg2[i],foodimg3[i],foodimg4[i]);
            modelRecyclerFood14ArrayList.add(view1);
        }
        adapter_recyclerfood14 = new ReviewsAdapter(ReviewsActivity.this,modelRecyclerFood14ArrayList);
        recyclerview.setAdapter(adapter_recyclerfood14);


    }

}

