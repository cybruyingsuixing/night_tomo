package com.bw.day0823_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private Switch switch_night;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       ThemeUtil.onActivityCreatedSetTheme(MainActivity.this);
        setContentView(R.layout.activity_main);


        initViews();
    }

    private void initViews() {
        switch_night = findViewById(R.id.s_v);
        switch_night.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ThemeUtil.ChangeCurrentTheme(MainActivity.this);
            }
        });
    }
}
