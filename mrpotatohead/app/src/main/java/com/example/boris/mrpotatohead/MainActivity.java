package com.example.boris.mrpotatohead;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // declaring addlistener functions for every checkbox
        addListenerOnArms();
        addListenerOnEars();
        addListenerOnEyebrows();
        addListenerOnEyes();
        addListenerOnGlasses();
        addListenerOnHat();
        addListenerOnMouth();
        addListenerOnMustache();
        addListenerOnNose();
        addListenerOnShoes();

    }

    private void addListenerOnArms() {
        final CheckBox arms = (CheckBox) findViewById(R.id.checkarms);
        arms.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView armsimage = (ImageView)findViewById(R.id.imageviewarms);
                // if the checkbox for arms is checked
                if (((CheckBox) v).isChecked()) {
                    armsimage.setVisibility(View.VISIBLE);
                }
                else {
                    armsimage.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private void addListenerOnEars() {
        final CheckBox ears = (CheckBox) findViewById(R.id.checkears);
        ears.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView earsimage = (ImageView)findViewById(R.id.imageviewears);

                if (((CheckBox) v).isChecked()) {
                    earsimage.setVisibility(View.VISIBLE);
                }
                else {
                    earsimage.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private void addListenerOnEyebrows() {
        final CheckBox eyebrows = (CheckBox) findViewById(R.id.checkeyebrows);
        eyebrows.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView eyebrowsimage = (ImageView)findViewById(R.id.imagevieweyebrows);

                if (((CheckBox) v).isChecked()) {
                    eyebrowsimage.setVisibility(View.VISIBLE);
                }
                else {
                    eyebrowsimage.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private void addListenerOnEyes() {
        final CheckBox eyes = (CheckBox) findViewById(R.id.checkeyes);
        eyes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView eyesimage = (ImageView)findViewById(R.id.imagevieweyes);

                if (((CheckBox) v).isChecked()) {
                    eyesimage.setVisibility(View.VISIBLE);
                }
                else {
                    eyesimage.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private void addListenerOnGlasses() {
        final CheckBox glasses = (CheckBox) findViewById(R.id.checkglasses);
        glasses.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView glassesimage = (ImageView)findViewById(R.id.imageviewglasses);

                if (((CheckBox) v).isChecked()) {
                    glassesimage.setVisibility(View.VISIBLE);
                }
                else {
                    glassesimage.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private void addListenerOnHat() {
        final CheckBox hat = (CheckBox) findViewById(R.id.checkhat);
        hat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView hatimage = (ImageView)findViewById(R.id.imageviewhat);

                if (((CheckBox) v).isChecked()) {
                    hatimage.setVisibility(View.VISIBLE);
                }
                else {
                    hatimage.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private void addListenerOnMouth() {
        final CheckBox mouth = (CheckBox) findViewById(R.id.checkmouth);
        mouth.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView mouthimage = (ImageView)findViewById(R.id.imageviewmouth);

                if (((CheckBox) v).isChecked()) {
                    mouthimage.setVisibility(View.VISIBLE);
                }
                else {
                    mouthimage.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private void addListenerOnMustache() {
        final CheckBox mustache = (CheckBox) findViewById(R.id.checkmustache);
        mustache.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView mustacheimage = (ImageView)findViewById(R.id.imageviewmustache);

                if (((CheckBox) v).isChecked()) {
                    mustacheimage.setVisibility(View.VISIBLE);
                }
                else {
                    mustacheimage.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private void addListenerOnNose() {
        final CheckBox nose = (CheckBox) findViewById(R.id.checknose);
        nose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView noseimage = (ImageView)findViewById(R.id.imageviewnose);

                if (((CheckBox) v).isChecked()) {
                    noseimage.setVisibility(View.VISIBLE);
                }
                else {
                    noseimage.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private void addListenerOnShoes() {
        final CheckBox shoes = (CheckBox) findViewById(R.id.checkshoes);
        shoes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView shoesimage = (ImageView)findViewById(R.id.imageviewshoes);

                if (((CheckBox) v).isChecked()) {
                    shoesimage.setVisibility(View.VISIBLE);
                }
                else {
                    shoesimage.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
