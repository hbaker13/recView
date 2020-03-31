package com.example.rv;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MekahActivity extends AppCompatActivity {

    TextView contentt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mekah);

        ActionBar aB = getSupportActionBar();
        contentt = findViewById(R.id.con);
    }
}
