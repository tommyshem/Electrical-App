package com.example.ElectricalApp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

      //todo change to list for the menu and add icons and text.
public class main_activity extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */

    public static Typeface tf;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //Load the freehand font so it can be used.
        tf = Typeface.createFromAsset(getAssets(),"fonts/script.ttf");

        //get the ids and store them
        Button button_ohmslaw = (Button) findViewById(R.id.button_ohmslaw);
        TextView tv_description = (TextView) findViewById(R.id.textViewDescpition);
        ImageButton button_triangle = (ImageButton) findViewById(R.id.button_triangle);

        //set the text to the freehand font.
        button_ohmslaw.setTypeface(tf);
        tv_description.setTypeface(tf);

        button_ohmslaw.setOnClickListener(this);
        button_triangle.setOnClickListener(this);
    }

          @Override
          public void onClick(View v) {

              switch(v.getId()) {
                  case R.id.button_ohmslaw:
                      Intent intent = new Intent(main_activity.this, ohms_law_activity.class);
                      startActivity(intent);
                      break;
                  case R.id.button_triangle:
                      Intent intent1 = new Intent(main_activity.this, triangle_activity.class);
                      startActivity(intent1);
                      break;
              }
      }
      }










