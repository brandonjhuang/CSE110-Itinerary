package com.example.evahuynh.popup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;


public class Popup_my extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_my);

        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                startActivity (new Intent (Popup_my.this, TaskScreen.class));
;            }
        });
    }
}
