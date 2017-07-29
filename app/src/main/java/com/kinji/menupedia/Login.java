package com.kinji.menupedia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_login);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title_bar);
        final TextView signUp = findViewById(R.id.login_signUp), fPassword = findViewById(R.id.login_fPassword);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signUpPressed();
            }
        });
        fPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fPasswordPressed();
            }
        });
        Button BLogin = findViewById(R.id.login_button);
        BLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bLoginPressed();
            }
        });
    }

    private void bLoginPressed() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    private void fPasswordPressed() {
        Intent intent = new Intent(this, FPassword.class);
        startActivity(intent);
    }

    private void signUpPressed() {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}