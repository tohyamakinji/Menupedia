package com.kinji.menupedia;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.*;

public class SignUp extends Activity {

    private TextView cityText;
    private LinearLayout cityDiv;
    private Spinner city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_sign_up);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title_bar);
        final TextView title = findViewById(R.id.custom_title);
        cityText = findViewById(R.id.signUp_cityText);
        title.setText(R.string.signUp_title);
        final Spinner country = findViewById(R.id.signUp_country);
        city = findViewById(R.id.signUp_citySpinner);
        ArrayAdapter<String> sAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, new String[]{"--Select Country--", "Indonesia", "USA"});
        country.setAdapter(sAdapter);
        cityDiv = findViewById(R.id.signUp_cityDiv);
        country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                countryItemSelected(adapterView, i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    private void countryItemSelected(AdapterView<?> adapterView, int i) {
        if (!adapterView.getItemAtPosition(i).equals("--Select Country--")) {
            cityText.setVisibility(View.VISIBLE);
            city.setVisibility(View.VISIBLE);
            cityDiv.setVisibility(View.VISIBLE);
        } else {
            cityText.setVisibility(View.GONE);
            city.setVisibility(View.GONE);
            cityDiv.setVisibility(View.GONE);
        }
    }
}