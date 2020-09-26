package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class VRActivity extends AppCompatActivity {
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_r);
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.vractivity);
        TextView TheTextView4 = (TextView) findViewById(R.id.textview5);
        this.message = getString(R.string.VR_title) +"\n"+ getString(R.string.onCreateExecuted) + "\n";
        TheTextView4.setText(message);
        Toast.makeText(this, "OnCreate invoked",  Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.vractivity);
        TextView TheTextView5 = (TextView) findViewById(R.id.textview6);
        this.message = "\n\n"+ getString(R.string.onStartExecuted);
        TheTextView5.setText(message);
        Toast.makeText(this, "OnStart invoked",  Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.vractivity);
        TextView TheTextView6 = (TextView) findViewById(R.id.textview6);
        this.message = getString(R.string.onStopExecuted) + "\n";
        TheTextView6.setText(message);
        Toast.makeText(this, "OnStop invoked",  Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.vractivity);
        TextView TheTextView7 = (TextView) findViewById(R.id.textview6);
        this.message = getString(R.string.onDestroyExecuted) + "\n";
        TheTextView7.setText(message);
        Toast.makeText(this, "OnDestroy invoked",  Toast.LENGTH_SHORT).show();
    }
}
