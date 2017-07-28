package com.kinji.menupedia;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FPassword extends Activity {

    private LinearLayout cardOne, cardTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_fpassword);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title_bar);
        final TextView title = findViewById(R.id.custom_title);
        title.setText(R.string.fPassword_title);
        cardOne = findViewById(R.id.FPassword_card_one);
        cardTwo = findViewById(R.id.FPassword_card_two);
        final Button nextCardOne = findViewById(R.id.FPassword_button_1);
        nextCardOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextCardOnePressed();
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (cardOne.getVisibility() == View.VISIBLE)
            super.onBackPressed();
        else {
            cardOne.setVisibility(View.VISIBLE);
            cardTwo.setVisibility(View.GONE);
        }
    }

    private void nextCardOnePressed() {
        cardOne.setVisibility(View.GONE);
        cardTwo.setVisibility(View.VISIBLE);
    }
}