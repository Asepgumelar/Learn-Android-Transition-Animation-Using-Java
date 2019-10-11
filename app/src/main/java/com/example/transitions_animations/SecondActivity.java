package com.example.transitions_animations;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends BaseClass {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Initialize the views
        ImageView redBlock = (ImageView)findViewById(R.id.redBlock);
        ImageView blueBlock = (ImageView)findViewById(R.id.blueBlock);
        ImageView yellowBlock = (ImageView)findViewById(R.id.yellowBlock);
        ImageView androidBlock = (ImageView)findViewById(R.id.androidBlock);

        //Set the methods from the base class to the appropriate ImageViews
        explodeTransition(this, redBlock);
        fadeTransition(this, blueBlock);
        rotateView(yellowBlock);
        switchAnimation(androidBlock,blueBlock,new Intent(this,MainActivity.class),this);
    }
}