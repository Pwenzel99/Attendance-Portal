package com.example.experiment;

import android.content.Intent;
import android.service.autofill.TextValueSanitizer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String p = LoginActivity.password;
        String u = LoginActivity.userName;
        TextView t = findViewById(R.id.Username);
        t.setText(u);
        t = findViewById(R.id.Password);
        t.setText(p);
    }

    public void continueToNext(View v){
        startActivity(new Intent(this, MapsActivity.class));
    }


}
