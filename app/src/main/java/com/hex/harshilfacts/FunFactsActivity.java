package com.hex.harshilfacts;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class FunFactsActivity extends ActionBarActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        final RelativeLayout backgroundColor = (RelativeLayout) findViewById(R.id.backgroundColor);


        //Declare view variables and assign views from layouts
        final TextView factLabel = (TextView) findViewById(R.id.boobFactText);
        final Button showFactButton = (Button) findViewById(R.id.viewFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //button was clicked so update fact label with a new fact
                String fact = mFactBook.getFact();

                //Update the label with new fact.
                factLabel.setText(fact);
                int color = mColorWheel.getColor();
                backgroundColor.setBackgroundColor(color);
                showFactButton.setTextColor(color);

            }
        };
        showFactButton.setOnClickListener(listener);

        //Toast.makeText(this,"Our Activity Was Created.",Toast.LENGTH_LONG).show();
        Log.d(TAG, "Delicious, it's running!");


    }

}
