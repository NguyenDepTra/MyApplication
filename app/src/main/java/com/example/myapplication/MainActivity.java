package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private BottomFragment fragment;
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = (BottomFragment) getSupportFragmentManager().findFragmentById(R.id.BotFrag);
        this.message = getString(R.string.Main_title) +"\n"+getString(R.string.onCreateExecuted)+"\n";
        fragment.display(message);
    }

    //@Override
    protected void onStart() {
        super.onStart();
        this.message += getString(R.string.onStartExecuted);
        fragment.display(this.message);
    }

}