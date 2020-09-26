package com.example.myapplication;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class AIActivity extends AppCompatActivity {
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_i);
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.vractivity);
        TextView TheTextView1 = (TextView) findViewById(R.id.textview3);
        this.message = getString(R.string.AI_title) + "\n" +getString(R.string.onCreateExecuted) + "\n";
        TheTextView1.setText(message);
        Toast.makeText(this, "OnCreate invoked",  Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.vractivity);
        TextView TheTextView2 = (TextView) findViewById(R.id.textview4);
        this.message = "\n\n" + getString(R.string.onStartExecuted);
        TheTextView2.setText(message);
        Toast.makeText(this, "OnStart invoked",  Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.vractivity);
        TextView TheTextView3 = (TextView) findViewById(R.id.textview4);
        this.message = getString(R.string.onStopExecuted) + "\n";
        TheTextView3.setText(message);
        Toast.makeText(this, "OnStop invoked",  Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.vractivity);
        TextView TheTextView4 = (TextView) findViewById(R.id.textview4);
        this.message = getString(R.string.onDestroyExecuted) + "\n";
        TheTextView4.setText(message);
        Toast.makeText(this, "OnDestroy invoked",  Toast.LENGTH_SHORT).show();
    }
}