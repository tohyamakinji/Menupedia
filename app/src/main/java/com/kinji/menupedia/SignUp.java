package com.kinji.menupedia;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class SignUp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_sign_up);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title_bar);
        TextView title = findViewById(R.id.custom_title);
        title.setText(R.string.signUp_title);
    }
}