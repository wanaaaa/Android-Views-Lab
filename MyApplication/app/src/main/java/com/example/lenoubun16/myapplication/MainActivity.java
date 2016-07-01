package com.example.lenoubun16.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView01, textView02;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        textView01 = (TextView) findViewById(R.id.textView1);


        final Button button = (Button) findViewById(R.id.buttonPanel1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                textView01.setError("I am clicked");
            }
        });


//        textView01 = (EditText) findViewById(R.id.textView1);
////        textView01.setText("New Text");
////        textView01.setTextColor(Color.RED);
//
//        textView03 = (EditText) findViewById(R.id.textView3);



//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String temp = textView01.getText().toString();
//                String temp01 = textView03.getText().toString();
//
//                if (textView01.getText().toString().trim().equalsIgnoreCase("")) {
//                    textView01.setError("This field can not be blank");
//                }
//
//                if (textView03.getText().toString().trim().equalsIgnoreCase("")) {
//                    textView03.setError("This field can not be blank");
//                }
//
//
//                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                intent.putExtra("123", temp);
//                intent.putExtra("124", temp01);
//                startActivity(intent);
//
//            }
//        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
