package com.example.evahuynh.popup;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.*;
import android.widget.*;


/**
 * Created by evahuynh on 10/30/15.
 */
public class TaskScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taskpopup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * 0.8), (int) (height * 0.8));
    }

    public void hidePopup(View view){
        //Button button = (Button) findViewById(R.id.button1);
        this.finish();
    }

    public void deselectButton2(View view){
        RadioButton b = (RadioButton) findViewById(R.id.radioButton2);
        b.setChecked(false);
    }

    public void deselectButton1(View view){
        RadioButton b = (RadioButton) findViewById(R.id.radioButton1);
        b.setChecked(false);
    }


}
