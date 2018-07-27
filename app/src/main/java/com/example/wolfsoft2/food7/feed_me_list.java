package com.example.wolfsoft2.food7;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class feed_me_list extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10, tv11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feed_me_list);


        tv1 = findViewById(R.id.login);
        tv2 = findViewById(R.id.login2);

        tv3 = findViewById(R.id.login3);
        tv4 = findViewById(R.id.login4);

        tv5 = findViewById(R.id.login5);
        tv6 = findViewById(R.id.login6);

        tv7 = findViewById(R.id.login7);
        tv8 = findViewById(R.id.login8);

        tv9 = findViewById(R.id.login9);
        tv10 = findViewById(R.id.login10);

        tv11 = findViewById(R.id.login11);


        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(feed_me_list.this, login.class);
                startActivity(in);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(feed_me_list.this, ProfileActivity.class);
                startActivity(in);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(feed_me_list.this, PaymentActivity.class);
                startActivity(in);
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(feed_me_list.this, NevigationActivity.class);
                startActivity(in);
            }
        });

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(feed_me_list.this, FavoriteActivity.class);
                startActivity(in);
            }
        });

        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(feed_me_list.this, HomepageActivity.class);
                startActivity(in);
            }
        });

        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(feed_me_list.this, NotificationsActivity.class);
                startActivity(in);
            }
        });

        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(feed_me_list.this, ReviewsActivity.class);
                startActivity(in);
            }
        });

        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(feed_me_list.this,activity_food13.class);
                startActivity(in);
            }
        });

        tv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(feed_me_list.this, food5_detail.class);
                startActivity(in);
            }
        });

        tv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(feed_me_list.this, food7.class);
                startActivity(in);
            }
        });
    }

}
