package com.example.wolfsoft2.food7;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import java.util.ArrayList;

import adapter.BookatableAdapter;
import model.BookatableModel;

public class BookATableMainactivity extends AppCompatActivity {
    TextView textView;

    private BookatableAdapter bookatableAdapter;
    private RecyclerView recyclerView;
    private ArrayList<BookatableModel> bookatableModelArrayList;

    String[] txttime = {"10.15","10.30","10.45","11.00","11.15","11:30","11:45"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookatable_main_activity);


        textView=findViewById(R.id.txtorder);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog myDialog = new Dialog(BookATableMainactivity.this);
                myDialog.getWindow();
                myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog.setCancelable(true);
                myDialog.setContentView(R.layout.dialogbox);
                myDialog.show();
            }
        });

        recyclerView = findViewById(R.id.recyclerview_id2);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(BookATableMainactivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(BookATableMainactivity.this,LinearLayoutManager.HORIZONTAL,false));



        bookatableModelArrayList = new ArrayList<>();

        for (int i = 0; i < txttime.length; i++) {
            BookatableModel view = new BookatableModel(txttime[i]);
            bookatableModelArrayList.add(view);
        }


        bookatableAdapter = new BookatableAdapter(BookATableMainactivity.this, bookatableModelArrayList);
        recyclerView.setAdapter(bookatableAdapter);




    }
}
