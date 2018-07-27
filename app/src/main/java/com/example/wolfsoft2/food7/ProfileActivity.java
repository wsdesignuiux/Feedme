package com.example.wolfsoft2.food7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;

import com.roughike.bottombar.BottomBar;

public class ProfileActivity extends AppCompatActivity {


    BottomBar bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        bottomBar = (BottomBar)findViewById(R.id.bottomBar);


        for (int i = 0; i < bottomBar.getTabCount(); i++) {
            bottomBar.getTabAtPosition(i).setGravity(Gravity.CENTER_VERTICAL);
        }
    }
}
