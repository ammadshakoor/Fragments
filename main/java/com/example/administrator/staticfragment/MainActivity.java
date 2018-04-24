package com.example.administrator.staticfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements FirstFragment.FirstActivityListener, SecondFragment.SecondActivityListener {

    private TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFirstActivity(String text){
        tvShow.setText(text);
    }

    @Override
    public void onSecondActivity(TextView tvShow){
        Log.d("onSecondActivity", "called");
        this.tvShow = tvShow;
    }

}
